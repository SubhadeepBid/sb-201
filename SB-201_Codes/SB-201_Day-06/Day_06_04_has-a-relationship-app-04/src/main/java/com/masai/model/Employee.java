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

//	Without using Line No. : 30

	/*
		mysql> SHOW TABLES;
		+--------------------+
		| Tables_in_masaidb  |
		+--------------------+
		| egen               |
		| employee           |
		| employee_addresses |
		+--------------------+
		3 rows in set (0.00 sec)
		
		mysql> SELECT * FROM employee; SELECT * FROM employee_addresses;
		+------+--------+--------+
		| eid  | ename  | salary |
		+------+--------+--------+
		| 1000 | Ram    |  78000 |
		| 1001 | Ramesh |  68000 |
		+------+--------+--------+
		2 rows in set (0.00 sec)
				
		+--------------+------------+---------+------------+--------+
		| Employee_eid | city       | pinCode | state      | type   |
		+--------------+------------+---------+------------+--------+
		|         1000 | Coimbatore | 551223  | Tamil Nadu | OFFICE |
		|         1000 | Patna      | 959894  | Bihar      | HOME   |
		|         1001 | Maharastra | 934794  | Mumbai     | HOME   |
		|         1001 | Maharastra | 379823  | Pune       | OFFICE |
		+--------------+------------+---------+------------+--------+
		4 rows in set (0.00 sec)
	 */
	
//	Using Line No. : 30
	
	/*
		mysql> SHOW TABLES;
		+-------------------+
		| Tables_in_masaidb |
		+-------------------+
		| egen              |
		| emp_address       |
		| employee          |
		+-------------------+
		3 rows in set (0.00 sec)

		mysql> SELECT * FROM employee; SELECT * FROM emp_address;
		+------+--------+--------+
		| eid  | ename  | salary |
		+------+--------+--------+
		| 1000 | Ram    |  78000 |
		| 1001 | Ramesh |  68000 |
		+------+--------+--------+
		2 rows in set (0.00 sec)

		+--------+------------+---------+------------+--------+
		| emp_id | city       | pinCode | state      | type   |
		+--------+------------+---------+------------+--------+
		|   1000 | Coimbatore | 551223  | Tamil Nadu | OFFICE |
		|   1000 | Patna      | 959894  | Bihar      | HOME   |
		|   1001 | Maharastra | 934794  | Mumbai     | HOME   |
		|   1001 | Maharastra | 379823  | Pune       | OFFICE |
		+--------+------------+---------+------------+--------+
		4 rows in set (0.00 sec)
	 */

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
