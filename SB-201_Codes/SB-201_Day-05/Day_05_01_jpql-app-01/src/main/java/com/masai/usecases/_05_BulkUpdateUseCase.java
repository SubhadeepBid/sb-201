package com.masai.usecases;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _05_BulkUpdateUseCase {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "update Account set balance = balance + 500";
		
		Query q = em.createQuery(jpql);
		
		
		em.getTransaction().begin();
		
		int x = q.executeUpdate();
		
		em.getTransaction().commit();
		
		
		System.out.println(x + " rows updated...");
		
		
		em.close();
		
	}

}
