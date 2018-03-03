package com.example.tutorial3.service;

import java.util.List;
import java.util.Optional;

import com.example.tutorial3.model.StudentModel;

public interface StudentService {
	StudentModel selectStudent(String npm);
	
	StudentModel selectStudent(Optional<String> npm);
	
	String deleteStudent(StudentModel student);
	
	List<StudentModel> selectAllStudent();
	
	void addStudent(StudentModel student);
}
