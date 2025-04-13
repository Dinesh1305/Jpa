package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Lecture;

public interface LectureRepo  extends JpaRepository<Lecture,Integer> {

}
