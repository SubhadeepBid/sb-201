package com.masai.usecases;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class _13_Project_FewColumnOfASingleRecordUseCase {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql= "select name, balance from Account where accno = :accno";
		
		
//		Query q = em.createQuery(jpql);
//		
//		q.setParameter("accno", 1003);
//		
//		
//		Object ob = q.getSingleResult();
//		
//		Object[] or = (Object[])ob;
		
		
//		Using TypedQuery
		
		TypedQuery<Object[]> tq = em.createQuery(jpql, Object[].class);
		
		tq.setParameter("accno", 1003);
		
		
		Object[] or = tq.getSingleResult();
		
		
		System.out.println("Name : " + or[0]);
		
		System.out.println("Balance : " + or[1]);
		
		
		em.close();
		
	}

}
