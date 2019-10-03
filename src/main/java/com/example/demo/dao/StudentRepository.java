package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentInfo;
import com.example.demo.utils.Constants;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query(value = Constants.QUERY)
	List<StudentInfo> findStudentInfo(@Param("studentName") String studentName);

}
