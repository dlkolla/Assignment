package com.example.demo.model;

public class StudentInfo {

	private int studentId;
	private String studentName;
	private String grade;
	private int classId;
	private String className;
	private int professorId;
	private String professorName;

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentInfo(int studentId, String studentName, String grade, int classId, String className, int professorId,
			String professorName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		this.classId = classId;
		this.className = className;
		this.professorId = professorId;
		this.professorName = professorName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

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

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", studentName=" + studentName + ", grade=" + grade
				+ ", classId=" + classId + ", className=" + className + ", professorId=" + professorId
				+ ", professorName=" + professorName + "]";
	}

}