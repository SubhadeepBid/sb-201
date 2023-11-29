package com.masai.usecases;

import java.util.List;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _11_Projecting_MultipleRows_And_1_ColumnUseCase {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		String jpql = "select name from Account";
		
		Query q = em.createQuery(jpql);
		
		
		List<String> names = q.getResultList();
		
		
		System.out.println(names);
		
		
		em.close();

	}

}
