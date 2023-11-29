package com.masai.usecases;

import java.util.List;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _12_Projecting_FewColumns_And_AllRowsUseCase {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "select name, balance from Account";
		
		Query q = em.createQuery(jpql);
		
		
		List<Object[]> results = q.getResultList();
		
		for(Object[] ob : results) {
			
			String name = (String)ob[0];
			
			int balance = (Integer)ob[1];
			
			
			System.out.println("Name is " + name);
			
			System.out.println("Balance is : " + balance);
			
			
			System.out.println("=======================");
			
		}
		
		
		em.close();
		
	}

}
