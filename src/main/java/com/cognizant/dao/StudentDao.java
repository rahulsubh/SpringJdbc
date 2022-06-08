package com.cognizant.dao;

import java.util.List;

import com.cognizant.entity.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int update(Student student);
	
	public int delete(int id);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudent();
	
}
