package com.masai.runner;

import java.util.Scanner;

import com.masai.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Demo2 {

	public static void main(String[] args) {

//		TODO: UPDATE Operation

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");

		EntityManager em = emf.createEntityManager();

		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Roll No. To Give Grace Marks : ");

		int roll = sc.nextInt();

		
		
		Student student = em.find(Student.class, roll);

		
		
		if (student != null) {

			System.out.print("Enter Grace Marks : ");

			int graceMarks = sc.nextInt();

			
			
			em.getTransaction().begin();
			
			student.setMarks(student.getMarks() + graceMarks);

			em.getTransaction().commit();
			
			
			
			System.out.println("DONE");

		} else {

			System.out.println("Student Not Found...");

		}
		
		
		
		em.close();
		
		sc.close();

	}

}
