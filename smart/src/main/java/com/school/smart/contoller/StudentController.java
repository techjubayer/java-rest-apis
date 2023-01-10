package com.school.smart.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.smart.dao.Student;
import com.school.smart.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService strv;
	
	@GetMapping(value = "/student/{id}")
	public Optional<Student> getStudent(@PathVariable("id") Integer id) {
		return strv.getStudent(id);
	}
	
	@PostMapping(value = "/createStudent")
	public Student createStudent(Student s) {
		return strv.createStudent(s);
	}
}
