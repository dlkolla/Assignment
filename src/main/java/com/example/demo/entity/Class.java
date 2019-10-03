package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "class")
public class Class {

	@Id
	@Column(name = "classId")
	private int classId;
	@Column(name = "className")
	private String className;
	@OneToMany(mappedBy = "classs")
	private List<StudentClass> students = new ArrayList<>();
	@OneToOne
	@JoinColumn(name = "professorId")
	private Professor professor;

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<StudentClass> getStudents() {
		return students;
	}

	public void setStudents(List<StudentClass> students) {
		this.students = students;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
