package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Buyer;
import com.bean.Flat;
import com.repository.BuyerRepository;
import com.repository.FlatRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.persistence.criteria.Subquery;

@Repository
public class BuyerDAO {

	@Autowired
	BuyerRepository buyerRepo;
	@Autowired
	FlatRepository flatRepo;

	@PersistenceContext
	private EntityManager entityManager;

	public void addBuyer(Buyer buyer) {
		buyerRepo.save(buyer);
	}

	public void addFlat(String buyer_id, Flat flat) {

		Buyer buyer = buyerRepo.findById(buyer_id).orElse(null);

		if (buyer != null) {
			flat.setBuyer(buyer); // add buyer to flat
			buyer.getFlatList().add(flat); // add flat to buyer
//			flatRepo.save(flat);
			buyerRepo.save(buyer);
		}

	}

	public List<Flat> flatWithMinPriceMaxRooms() {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<Flat> cq = cb.createQuery(Flat.class);
		Root<Flat> root = cq.from(Flat.class);

		// Subquery for minimum price
		Subquery<Double> minPriceSub = cq.subquery(Double.class);
		Root<Flat> priceRoot = minPriceSub.from(Flat.class);
		minPriceSub.select(cb.min(priceRoot.get("flatPrice")));

		// Subquery for maximum rooms
		Subquery<Integer> maxRoomSub = cq.subquery(Integer.class);
		Root<Flat> roomRoot = maxRoomSub.from(Flat.class);
		maxRoomSub.select(cb.max(roomRoot.get("numberOfRooms")));

		cq.select(root).where(
				cb.and(cb.equal(root.get("flatPrice"), minPriceSub), cb.equal(root.get("numberOfRooms"), maxRoomSub)));

		return entityManager.createQuery(cq).getResultList();
	}

}