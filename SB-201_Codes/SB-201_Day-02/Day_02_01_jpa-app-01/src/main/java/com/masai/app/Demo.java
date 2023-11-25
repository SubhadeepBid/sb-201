package com.masai.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		emf.createEntityManager();
		
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 10);
		
		System.out.println(student);
		
		em.close();
		
		emf.close();
	}

}
