package com.masai.usecases;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _08_DeleteUseCase {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "delete from Account where accno = :accno";
		
		Query q = em.createQuery(jpql);
		
		
		q.setParameter("accno", 1002);
		
		
		em.getTransaction().begin();
		
		int x = q.executeUpdate();
		
		em.getTransaction().commit();
		

		System.out.println(x + " rows deleted...");

		
		em.close();
		
	}

}
