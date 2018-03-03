package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService{
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm){
		for(int i=0; i<studentList.size(); i++){
			if(studentList.get(i).getNpm().equals(npm)) {
				return studentList.get(i);
			}
		}
		return null;
	}
	
	@Override
	public List<StudentModel> selectAllStudent(){
		return studentList;
	}
	
	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}
	
	@Override
	public StudentModel selectStudent(Optional<String> npm){
		for(int i=0; i<studentList.size(); i++){
			if(studentList.get(i).getNpm().equals(npm)) {
				return studentList.get(i);
			}
		}
		return null;
	}
	
	@Override
	public String deleteStudent(StudentModel student){
		int index = studentList.indexOf(student);
		studentList.remove(index);
		return "Data Berhasl Dihapus";
	}
	
}
