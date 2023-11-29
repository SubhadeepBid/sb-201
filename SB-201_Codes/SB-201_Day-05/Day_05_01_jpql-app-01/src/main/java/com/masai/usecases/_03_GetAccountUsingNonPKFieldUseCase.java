package com.masai.usecases;

import java.util.List;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _03_GetAccountUsingNonPKFieldUseCase {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
//		String jpql = "select a from Account a where a.name = 'Ram'";
		String jpql = "from Account where name = 'Ram'";

		Query q = em.createQuery(jpql);
		
		
//		If the field is not UNIQUE then
		
//		List<Account> accounts = q.getResultList();
//		
//		accounts.forEach(account -> System.out.println(account));
		
		
//		If the field is UNIQUE then
		
		Account account = (Account)q.getSingleResult();
		
		System.out.println(account);
		
		
		em.close();
		
		
		System.out.println("DONE");
		
	}

}
