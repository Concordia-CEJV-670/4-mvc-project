package com.project.practice.service;

import java.util.List;

import com.project.practice.entity.Course;

public interface CourseService {
    Course getCourse(Long id);

    Course saveCourse(Course c);

    void deleteCourse(Long id);

    List<Course> getCourses();
}