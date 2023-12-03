package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_id_gen")
	@SequenceGenerator(name = "emp_id_gen", sequenceName = "egen", allocationSize = 1, initialValue = 1000)
	private int eid;

	private String ename;

	private int salary;

	@Embedded
	@ElementCollection
	@JoinTable(name = "emp_address", joinColumns = @JoinColumn(name = "emp_id"))
	private Set<Address> addresses = new HashSet<>();

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, int salary, Set<Address> addresses) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.addresses = addresses;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addresses=" + addresses + "]";
	}

}
