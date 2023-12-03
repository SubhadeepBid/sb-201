package com.masai.runner;

import com.masai.model.Employee;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;

public class Demo1 {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		Employee employee = em.find(Employee.class, 1001);

		
		em.close();
		/*
		 * Even though before closing the EntityManager object,
		 * we got the Employee object
		 * but here only Employee related object will be loaded, Address object data will not be loaded
		 * so while fetching the Address related data we will get an exception
		 * 
		 */
		
		
		System.out.println("Employee ID : " + employee.getEid());
		System.out.println("Employee Name : " + employee.getEname());
		System.out.println("Employee Salary : " + employee.getSalary());
		System.out.println("Employee Addresses : " + employee.getAddresses());
		
	}

}
