package com.masai.usecases;

import java.util.List;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _17_Named_Native_QueriesUseCase {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		Query q = em.createNamedQuery("Account.allAccount");
		
		List<Account> accounts = q.getResultList();
		
		
		accounts.forEach(a-> System.out.println(a));
		
		
		em.close();

	}

}
