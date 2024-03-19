package com.project.practice.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.practice.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}