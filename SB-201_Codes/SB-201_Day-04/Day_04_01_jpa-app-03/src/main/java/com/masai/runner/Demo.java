package com.masai.runner;

import com.masai.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager();
		
		
		
		Student student1 = new Student();
		student1.setName("Ram");
		student1.setMarks(700);
		
		Student student2 = new Student();
		student2.setName("Ramesh");
		student2.setMarks(720);
		
		Student student3 = new Student();
		student3.setName("Ravi");
		student3.setMarks(740);
		
		
		
		em.getTransaction().begin();
		
		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		
		em.getTransaction().commit();
		
		
		
		em.close();
		
		
		
		System.out.println("DONE");
		
	}

}
