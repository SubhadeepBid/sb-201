package com.masai.usecases;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _09_InsertUsingJPQLUseCase {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "insert into Account(balance, name) values(7500, 'Amit')";
		
		Query q = em.createQuery(jpql);
		
		
		em.getTransaction().begin();
		
		int x = q.executeUpdate();
		
		em.getTransaction().commit();
		
		
		System.out.println(x + " rows inserted...");
		
		
		em.close();
		
	}

}
