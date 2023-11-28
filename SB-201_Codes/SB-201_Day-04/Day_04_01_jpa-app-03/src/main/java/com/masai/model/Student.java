package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
//@Table(name = "mystudent")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator ="studentgen")
	@SequenceGenerator(name="studentgen", sequenceName="sgen", allocationSize=1, initialValue=1000)
//	@Column(name = "sroll")
	private int roll;
	
//	@Column(name = "sname")
	private String name;
	
//	@Column(name = "smarks")
//	@Transient
	private int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

}
