package com.masai.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	@AttributeOverrides({
		@AttributeOverride(name = "city", column = @Column(name = "HOME_CITY")),
		@AttributeOverride(name = "state", column = @Column(name = "HOME_STATE")),
		@AttributeOverride(name = "pinCode", column = @Column(name = "HOME_PINCODE"))
	})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY")),
		@AttributeOverride(name = "state", column = @Column(name = "OFFICE_STATE")),
		@AttributeOverride(name = "pinCode", column = @Column(name = "OFFICE_PINCODE"))
	})
	private Address officeAddress;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, int salary, Address homeAddress, Address officeAddress) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", homeAddress=" + homeAddress
				+ ", officeAddress=" + officeAddress + "]";
	}

}
