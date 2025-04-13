package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.model.Section;
@Component
public interface SectionRepo extends JpaRepository<Section,Integer>{

}
