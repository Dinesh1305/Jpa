package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Author;
import com.demo.repo.AuthorRepo;

@Controller
public class AuthorController {
	 @Autowired
	 private AuthorRepo authorRepo;
	 @RequestMapping("authorForm")
	 public String author1(Model model) {
	     model.addAttribute("author", new Author());  // Ensure 'Author' is a class you have defined
	     return "author";  // Corresponds to the 'author.html' Thymeleaf template
	 }
	 @RequestMapping("saveAuthor")
	 public String add(@ModelAttribute("author") Author author) {
	     try {
	     	 Author savedAuthor = authorRepo.save(author);
	     	 System.out.println(savedAuthor);
	 	} catch (Exception e) {

	 		e.printStackTrace();
	 	}  

	     return "index";  // Redirecting to another page (e.g., the list of authors)
	 }
}
