package com.masai.usecases;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _06_PositionalParameterUseCase {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "update Account set balance = balance + ?1 where name = ?2";
		
		Query q = em.createQuery(jpql);
		
		
		q.setParameter(1, 500);
		
		q.setParameter(2, "Ramesh");
		
		
		em.getTransaction().begin();
		
		int x = q.executeUpdate();
		
		em.getTransaction().commit();
		
		
		System.out.println(x + " rows updated...");
		
		
		em.close();
		
	}

}
