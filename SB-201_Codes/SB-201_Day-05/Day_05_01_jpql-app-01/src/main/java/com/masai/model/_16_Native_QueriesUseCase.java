package com.masai.model;

import java.util.List;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _16_Native_QueriesUseCase {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String nq = "select * from account";
		
		Query q = em.createNativeQuery(nq, Account.class);
		
		
		List<Account> accounts = q.getResultList();
		
		accounts.forEach(a -> System.out.println(a));
		
		
		em.close();
		
	}

}
