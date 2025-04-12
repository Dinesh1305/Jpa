package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.model.Course;
@Component
public interface CourseRepo extends  JpaRepository<Course,Integer> {

}
