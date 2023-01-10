package com.school.smart.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.smart.dao.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
