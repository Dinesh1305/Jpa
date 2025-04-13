package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Resources;
import com.demo.repo.ResourcesRepo;

@Controller
public class ResourcesController {
	
	 @Autowired
	 private ResourcesRepo resourcesRepo;
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
}
