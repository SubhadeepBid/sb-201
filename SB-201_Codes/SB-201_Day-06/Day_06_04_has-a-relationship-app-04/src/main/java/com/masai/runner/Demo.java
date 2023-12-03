package com.masai.runner;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		Employee employee1 = new Employee();
		employee1.setEname("Ram");
		employee1.setSalary(78000);
		employee1.getAddresses().add(new Address("Patna", "Bihar", "959894", "HOME"));
		employee1.getAddresses().add(new Address("Coimbatore", "Tamil Nadu", "551223", "OFFICE"));
		
		Employee employee2 = new Employee();
		employee2.setEname("Ramesh");
		employee2.setSalary(68000);
		employee2.getAddresses().add(new Address("Maharastra", "Mumbai", "934794", "HOME"));
		employee2.getAddresses().add(new Address("Maharastra", "Pune", "379823", "OFFICE"));
		
		
		em.getTransaction().begin();
		
		em.persist(employee1);
		em.persist(employee2);
		
		em.getTransaction().commit();
		
		
		System.out.println("DONE");
		
		
		em.close();
		
	}

}
