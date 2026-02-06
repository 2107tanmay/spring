package com.bean;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "buyer")
public class Buyer {

	@Id
	@Column(name = "buyer_id")
	private String buyerId;
	@Column(name = "buyer_name")
	private String buyerName;
	@Column(name = "buyer_contact_number")
	private String buyerContactNumber;

	// has one to many relationship
	@OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL)
	private List<Flat> flatList = new ArrayList<Flat>();

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerContactNumber() {
		return buyerContactNumber;
	}

	public void setBuyerContactNumber(String buyerContactNumber) {
		this.buyerContactNumber = buyerContactNumber;
	}

	public List<Flat> getFlatList() {
		return flatList;
	}

	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}

}