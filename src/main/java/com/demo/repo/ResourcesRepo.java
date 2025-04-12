package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Resources;

public interface ResourcesRepo extends JpaRepository<Resources,Integer> {

}
