package com.masai.usecases;

import java.util.List;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _02_GetAllAccountsUseCase {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
//		String jpql = "select a from Account a";
		String jpql = "from Account";
		
		Query q = em.createQuery(jpql);
		
		
		List<Account> accounts = q.getResultList();
		
		accounts.forEach(account -> System.out.println(account));

		
		em.close();
		
		
		System.out.println("DONE");
		
	}

}
