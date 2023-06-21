package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component
public interface StudentDao {

		public int insert(Student student);
		
		public int change(Student student);
		
		public int delete(int studentid);
		
		public Student getStudent(int studentid);
		
		public List<Student> getAllStudents();

	
}
