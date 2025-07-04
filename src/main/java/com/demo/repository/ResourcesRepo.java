package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.demo.model.Resources;
@Repository
public interface ResourcesRepo extends JpaRepository<Resources,Integer> {

}
