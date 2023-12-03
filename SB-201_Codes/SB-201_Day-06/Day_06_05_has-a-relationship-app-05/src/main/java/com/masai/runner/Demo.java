package com.masai.runner;

import java.util.List;

import com.masai.model.Address;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
//		Get all the Address of an Employee whose name is Ramesh
		
//			APPROACH : 01
		
//		String jpql = "from Employee where ename = 'Ramesh'";
//		
//		Query q = em.createQuery(jpql);
//		
//		
//		List<Employee> employees = q.getResultList();
//		
//		
//		for(Employee employee : employees) {
//			
//			Set<Address> addresses = employee.getAddresses();
//			
//			for(Address address : addresses) {
//				System.out.println(address);
//			}
//			
//		}
		
		
//			APPROACH : 02
		String jpql = "select addresses from Employee where ename = 'Ramesh'";
		
		Query q = em.createQuery(jpql);
		
		
		List<Address> addresses = q.getResultList();
		
		
		for(Address address : addresses) {
			System.out.println(address);
		}
		
		
		em.close();
		
	}

}
