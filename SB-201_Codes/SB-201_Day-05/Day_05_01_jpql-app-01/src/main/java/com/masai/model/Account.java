package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;

@Entity
@NamedQuery(name = "Account.getBalance", query = "from Account where balance < :bal")
@NamedNativeQuery(name = "Account.allAccount", query = "select * from account", resultClass = Account.class)
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_no_gen")
	@SequenceGenerator(name = "acc_no_gen", sequenceName = "agen", allocationSize = 1, initialValue = 1000)
	private int accno;
	
	private String name;
	
	private int balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accno, String name, int balance) {
		super();
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", name=" + name + ", balance=" + balance + "]";
	}

}
