package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Lecture;
@Repository
public interface LectureRepo  extends JpaRepository<Lecture,Integer> {

}
