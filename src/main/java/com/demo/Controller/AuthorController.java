package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Author;
import com.demo.service.AuthorService;

@Controller
public class AuthorController {
	 
	 @Autowired
	 private AuthorService service;
	 
	 @GetMapping("authorForm")
	 public String author1(Model model) {
	     model.addAttribute("author", new Author());  
	     return "author";  
	 }
	 @PostMapping("saveAuthor")
	 public String add(@ModelAttribute Author author) {
	  
		 service.save(author);
		 
	     return "index";  
	 }
}
