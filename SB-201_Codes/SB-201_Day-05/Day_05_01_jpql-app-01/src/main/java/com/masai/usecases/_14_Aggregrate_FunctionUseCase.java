package com.masai.usecases;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class _14_Aggregrate_FunctionUseCase {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "select sum(balance) from Account";
		
		TypedQuery<Long> tq = em.createQuery(jpql, Long.class);
		
		
		long result = tq.getSingleResult();
		
		
		System.out.println("SUM : " + result);
		
		
		em.close();
		
	}

}
