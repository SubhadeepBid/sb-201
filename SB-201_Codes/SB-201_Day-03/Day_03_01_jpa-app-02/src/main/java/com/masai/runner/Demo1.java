package com.masai.runner;

import java.util.Scanner;

import com.masai.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo1 {

	public static void main(String[] args) {

//		TODO: DELETE Operation

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");

		EntityManager em = emf.createEntityManager();

		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Roll No. To DELETE The Student : ");

		int roll = sc.nextInt();

		
		
		Student student = em.find(Student.class, roll);

		
		
		if (student != null) {
			
			em.getTransaction().begin();

			em.remove(student);

			em.getTransaction().commit();

			
			
			System.out.println("Student Removed Successfully...");
		
		} else {
			
			System.out.println("Student Not Found...");
			
		}

		
		
		em.close();

		sc.close();

	}

}
