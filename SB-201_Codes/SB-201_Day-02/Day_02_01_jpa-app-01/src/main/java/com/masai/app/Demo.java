package com.masai.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 100);
		
		if(student != null) {
			System.out.println(student);
		}
		else {
			System.out.println("Student Not Found!");
		}
		
		em.close();
		
	}

}
