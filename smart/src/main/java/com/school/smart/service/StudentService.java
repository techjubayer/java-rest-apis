package com.school.smart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.smart.dao.Student;
import com.school.smart.repository.StudentRepository;
@Service
public class StudentService {
@Autowired
StudentRepository strp;
	public Optional<Student> getStudent(Integer id) {
		return strp.findById(id);
	}
	public Student createStudent(Student s) {
		return strp.save(s);
	}
	
}
