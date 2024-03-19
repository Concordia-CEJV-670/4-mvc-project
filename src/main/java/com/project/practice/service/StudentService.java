package com.project.practice.service;

import java.util.List;

import com.project.practice.entity.Student;

public interface StudentService {
    Student getStudent(Long id);

    Student saveStudent(Student student);

    void deleteStudent(Long id);

    List<Student> getStudents();
}