package com.example.demo.utils;

public class Constants {

	public static final String QUERY = "select NEW com.example.demo.dto.StudentInfo(s.studentId, s.studentName, sc.grade, c.classId, c.className, p.professorId, p.professorName) from student s inner join student_class sc on "
			+ " s.studentId=sc.student.studentId inner join class c on c.classId=sc.classs.classId inner join professor p"
			+ " on p.professorId = c.professor.professorId" + " where s.studentName = :studentName";

}
