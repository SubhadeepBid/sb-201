package com.masai.runner;

import com.masai.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
		
//		TODO: INSERT Operation
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager();
		
		
		
//		Student student = new Student(14, "Amit", 700); // New/Transient State
//		
//		
//		
//		EntityTransaction et = em.getTransaction();
//		
//		et.begin();
//		
//		em.persist(student);
//		
//		et.commit();
//		
//		
//		
//		System.out.println("DONE");
		
		
		
		
//		EntityTransaction et1 = em.getTransaction();
//		
//		EntityTransaction et2 = em.getTransaction();
//		
//		System.out.println(et1 == et2); // true
		
		
		
		
//		ShortCut Approach : Since EntityTransaction object is a singleton object
		
		Student student = new Student(15, "Rohit", 650);
		
		
		
		em.getTransaction().begin();
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		
		
		System.out.println("DONE");
		
		
		
		em.close();
		
	}

}
