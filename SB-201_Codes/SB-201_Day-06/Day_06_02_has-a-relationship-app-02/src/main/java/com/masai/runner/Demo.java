package com.masai.runner;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		Employee employee = new Employee();
		employee.setEname("Ram");
		employee.setSalary(78000);
		employee.setAddress(new Address("Patna", "Bihar", "959894"));
		
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		em.getTransaction().commit();
		
		
		System.out.println("DONE");
		
		
		em.close();
		
	}

}
