package com.masai.usecases;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class _10_Projecting_1_Row_And_1_ColumnUseCase {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "select name from Account where accno = :accno";
		
		
//		Query q = em.createQuery(jpql);
//		
//		
//		q.setParameter("accno", 1003);
//		
//		String name = (String)q.getSingleResult();
		
		
//		Using TypedQuery
		
		TypedQuery<String> tq = em.createQuery(jpql, String.class);
		
		tq.setParameter("accno", 1003);
		
		
		String name = tq.getSingleResult();
		
		
		System.out.println("Name : " + name);
		
		
		em.close();

	}

}
