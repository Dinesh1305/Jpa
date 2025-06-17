package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.demo.model.Author;
@Component
public interface AuthorRepo extends JpaRepository<Author,Integer>	 {

}
