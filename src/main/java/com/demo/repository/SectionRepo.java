package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.demo.model.Section;
@Repository
public interface SectionRepo extends JpaRepository<Section,Integer>{

}
