package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Student;
import com.coforge.services.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	StudentService service;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	
}
