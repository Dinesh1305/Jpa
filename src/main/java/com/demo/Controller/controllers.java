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
	 @Autowired
	    private AuthorRepo authorRepo;
	 @Autowired
	  private CourseRepo courseRepo;
	 @Autowired
	 private ResourcesRepo resourcesRepo;
@RequestMapping("/")
public String index(){
	return "index";
}
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
@RequestMapping("/saveCourse")
public String savecourse(@ModelAttribute("course") Course c)
{
	System.out.println("hello"+" "+c);
	courseRepo.save(c);
	
	return "index";
}
@RequestMapping("courseForm")
public String courses(Model model) {
    model.addAttribute("course", new Course());  // Add this line
    return "course";
}

@RequestMapping("resourceForm")
public String resources(Model model)
{
	model.addAttribute("resources",new Resources());
	return "resources";
}
@RequestMapping("/saveResources")
public String resources1(@ModelAttribute("resources") Resources r)
{
	System.out.println(r);
resourcesRepo.save(r);
return "index";
}
@RequestMapping("lectureForm")
public String  lecture()
{
	return "lecture";
}
@RequestMapping("SectionForm")
public String Section()
{
	return "section";
}
}
