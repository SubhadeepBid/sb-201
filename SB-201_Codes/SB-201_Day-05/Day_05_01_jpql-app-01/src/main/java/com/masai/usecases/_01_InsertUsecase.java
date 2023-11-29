package com.masai.usecases;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;

public class _01_InsertUsecase {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		Account account = new Account();
		account.setName("Mukesh");
		account.setBalance(8800);
		
		
		em.getTransaction().begin();
		
		em.persist(account);
		
		em.getTransaction().commit();
		
		
		em.close();
		
		
		System.out.println("DONE");
		
	}

}
