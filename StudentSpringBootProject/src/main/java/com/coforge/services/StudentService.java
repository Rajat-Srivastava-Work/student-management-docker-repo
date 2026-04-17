package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.coforge.entities.Student;
import com.coforge.repository.StudentRepository;

public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}

}
