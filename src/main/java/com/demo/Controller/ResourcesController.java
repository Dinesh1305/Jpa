package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Resources;
import com.demo.repository.ResourcesRepo;

@Controller
public class ResourcesController {
	
	 @Autowired
	 private ResourcesRepo resourcesRepo;
	@GetMapping("resourceForm")
	public String resources(Model model)
	{
		model.addAttribute("resources",new Resources());
		return "resources";
	}
	@PostMapping("/saveResources")
	public String resources1(@ModelAttribute("resources") Resources r)
	{
		System.out.println(r);
	resourcesRepo.save(r);
	return "index";
	}
}
