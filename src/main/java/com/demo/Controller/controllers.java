package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Author;
import com.demo.model.Course;
import com.demo.model.Resources;
import com.demo.repo.AuthorRepo;
import com.demo.repo.CourseRepo;
import com.demo.repo.ResourcesRepo;

@Controller
public class controllers {
	


@RequestMapping("/")
public String index(){
	return "index";
}





@RequestMapping("SectionForm")
public String Section()
{
	return "section";
}
}
