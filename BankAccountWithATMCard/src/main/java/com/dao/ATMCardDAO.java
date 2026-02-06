package com.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.ATMCard;
import com.bean.Account;
import com.repository.ATMCardRepository;
import com.repository.AccountRepository;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Repository
public class ATMCardDAO {
	
	private Logger log = LoggerFactory.getLogger(ATMCardDAO.class);
	
	@Autowired
	private AccountRepository repo;
	
	public void issueATMCardToAccount(int accountNumber, ATMCard atmCardObject) {
			//fill code
		
		Optional<Account> opt = repo.findById(accountNumber);
		
		if(opt.isPresent()) {
			Account acc = opt.get();
			
			if(acc.getAtmCard() != null) {
				log.error("ATM card not issued to account Number {}", acc.getAccountNumber());
				return;
			}
			
			atmCardObject.setAccount(acc);
			acc.setAtmCard(atmCardObject);
			
			repo.save(acc);
			
			log.info("ATM card successfully issued to account number {}", acc.getAccountNumber());
		}
		
		
	}

}
