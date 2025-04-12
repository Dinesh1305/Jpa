package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Course;

public interface CourseRepo extends  JpaRepository<Course,Integer> {

}
