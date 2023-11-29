package com.masai.usecases;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class _04_GetAccountUsingNonPKFieldUsingTypedQueryUseCase {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "from Account where name = 'Ram'";

		TypedQuery<Account> tq = em.createQuery(jpql, Account.class);
		
		
		Account account = tq.getSingleResult();
		
		System.out.println(account);

		
		em.close();
		
		
		System.out.println("DONE");
		
	}

}
