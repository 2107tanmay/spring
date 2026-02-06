package com.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Account;
import com.repository.AccountRepository;


@Repository
public class AccountDAO {
    private Logger log = LoggerFactory.getLogger(AccountDAO.class);
	
	@Autowired
	private AccountRepository repo;
	
	public void openAccount(Account account) {
		//fill code
		repo.save(account);
		log.info("Account with id {} added successfully", account.getAccountNumber());
	}
	
	public List<Account> retrieveAccountBasedOnCardType(String cardType){
		//fill code
		List<Account> list = repo.findByAtmCardCardType(cardType);
		
		if(list.isEmpty()) {
			log.error("No account with this card type {}", cardType);
		}
		else {
			log.info("Account details with card type {} retrieved successfully", cardType);
		}
		
		return list;
		
	}
}
