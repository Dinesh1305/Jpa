package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Course;
import com.demo.repo.CourseRepo;
@Controller
public class CourseController {
	 @Autowired
	  private CourseRepo courseRepo;
	 
	@RequestMapping("/saveCourse")
	public String savecourse(@ModelAttribute("course") Course c)
	{
		//System.out.println("hello"+" "+c);
		courseRepo.save(c);
		
		return "index";
	}
	@RequestMapping("courseForm")
	public String courses(Model model) {
	    model.addAttribute("course", new Course());  // Add this line
	    return "course";
	}
}
