package com.masai.usecases;

import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class _07_NamedParameterUseCase {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();

		
		String jpql = "update Account set balance = balance + :bonus where name = :name";

		Query q = em.createQuery(jpql);

		
		q.setParameter("bonus", 500);

		q.setParameter("name", "Mukesh");

		
		em.getTransaction().begin();

		int x = q.executeUpdate();

		em.getTransaction().commit();

		
		System.out.println(x + " rows updated...");

		
		em.close();

	}

}
