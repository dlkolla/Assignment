package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "student")
public class Student {

	@Id
	@Column(name = "studentId")
	private int studentId;
	@Column(name = "studentName")
	private String studentName;

	@OneToMany(mappedBy = "student")
	private List<StudentClass> classes = new ArrayList<>();

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getSutdentName() {
		return studentName;
	}

	public void setSutdentName(String sutdentName) {
		this.studentName = sutdentName;
	}

	public List<StudentClass> getClasses() {
		return classes;
	}

	public void setClasses(List<StudentClass> classes) {
		this.classes = classes;
	}

}
