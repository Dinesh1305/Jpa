package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.model.Course;
@Repository
public interface CourseRepo extends  JpaRepository<Course,Integer> {

}
