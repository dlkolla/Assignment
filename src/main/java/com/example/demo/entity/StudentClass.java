package com.example.demo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "student_class")
public class StudentClass {

	@EmbeddedId
	StudentClassId studentClassId;
	@ManyToOne
	@JoinColumn(name = "studentId", updatable = false, insertable = false)

	private Student student;
	@ManyToOne
	@JoinColumn(name = "classId", updatable = false, insertable = false)
	private Class classs;
	private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public StudentClassId getStudentClassId() {
		return studentClassId;
	}

	public void setStudentClassId(StudentClassId studentClassId) {
		this.studentClassId = studentClassId;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Class getClasss() {
		return classs;
	}

	public void setClasss(Class classs) {
		this.classs = classs;
	}

}
