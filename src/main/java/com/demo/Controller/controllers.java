package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Author;
import com.demo.model.Course;
import com.demo.model.Resources;
import com.demo.repository.AuthorRepo;
import com.demo.repository.CourseRepo;
import com.demo.repository.ResourcesRepo;

@Controller
public class controllers {
	


@GetMapping("/")
public String index(){
	return "index";
}





@RequestMapping("SectionForm")
public String Section()
{
	return "section";
}
}
