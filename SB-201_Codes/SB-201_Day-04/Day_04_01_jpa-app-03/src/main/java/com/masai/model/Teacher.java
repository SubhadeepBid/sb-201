package com.masai.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {
	@Id
	private Integer teacherId;
	
	private String teacherName;
	
	private String teacherAdderss;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(Integer teacherId, String teacherName, String teacherAdderss) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherAdderss = teacherAdderss;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherAdderss() {
		return teacherAdderss;
	}

	public void setTeacherAdderss(String teacherAdderss) {
		this.teacherAdderss = teacherAdderss;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherAdderss=" + teacherAdderss
				+ "]";
	}

}
