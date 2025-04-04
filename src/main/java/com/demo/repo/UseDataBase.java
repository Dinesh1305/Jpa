package com.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.model.Author;
@Component
public class UseDataBase {
	
	@Autowired
	AuthorRepo a;
public  void use()
{

	System.out.println(a.count());
}
public void insert()
{
	 Author author = new Author();
     author.setFirstName("Akesh");
     author.setLastName("P");
     author.setEmail("71762305003@cit.edu.in");
      a.save(author);
}
}
