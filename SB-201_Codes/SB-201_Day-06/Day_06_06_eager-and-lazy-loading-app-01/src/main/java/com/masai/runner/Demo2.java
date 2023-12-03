package com.masai.runner;

import com.masai.model.Employee;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;

public class Demo2 {

	public static void main(String[] args) {

		EntityManager em = EMUtil.provideEntityManager();
		
		
		Employee employee = em.find(Employee.class, 1001);
		
		
		System.out.println("Employee ID : " + employee.getEid());
		System.out.println("Employee Name : " + employee.getEname());
		System.out.println("Employee Salary : " + employee.getSalary());
		System.out.println("Employee Addresses : " + employee.getAddresses());
		
		/*
		 * Here as soon as the execution of line 21 starts
		 * Hibernate will fetch the Address object 
		 * Hence we will get no exception over here
		 * 
		 */
		
		
		em.close();
		
	}

}
