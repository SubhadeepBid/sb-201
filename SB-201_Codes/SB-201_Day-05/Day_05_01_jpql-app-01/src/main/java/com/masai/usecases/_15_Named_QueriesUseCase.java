package com.masai.usecases;

import java.util.List;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _15_Named_QueriesUseCase {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		Query q = em.createNamedQuery("Account.getBalance");
		
		q.setParameter("bal", 9000);
		
		
		List<Account> accounts = q.getResultList();
		
		accounts.forEach(a -> System.out.println(a));
		
		
		em.close();
		
	}

}
