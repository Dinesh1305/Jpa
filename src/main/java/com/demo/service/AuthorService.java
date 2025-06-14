package com.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Author;
import com.demo.repo.AuthorRepo;

@Service
public class AuthorService {

	@Autowired
	AuthorRepo repo;
	
	public void save(Author author)
	{
		repo.save(author);
		
	}

}
