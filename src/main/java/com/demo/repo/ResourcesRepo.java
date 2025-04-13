package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.model.Resources;
@Component
public interface ResourcesRepo extends JpaRepository<Resources,Integer> {

}
