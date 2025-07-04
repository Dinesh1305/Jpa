package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.Lecture;
import com.demo.repository.LectureRepo;
@Controller
public class LectureController {
@Autowired
private LectureRepo lecture;

@PostMapping("lectureForm")
public String SetLecture(Model model)
{
	model.addAttribute("lecture", new Lecture()); 
	return "lecture";
}
@GetMapping("savelecture")
public String add(@ModelAttribute("lecture")Lecture  m)
{
	lecture.save(m);
	return "index";
}
}
