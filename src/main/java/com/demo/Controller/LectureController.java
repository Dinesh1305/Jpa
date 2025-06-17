package com.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Lecture;
import com.demo.repository.LectureRepo;
@Controller
public class LectureController {
@Autowired
private LectureRepo lecture;

@RequestMapping("lectureForm")
public String SetLecture(Model model)
{
	model.addAttribute("lecture", new Lecture()); 
	return "lecture";
}
@RequestMapping("savelecture")
public String add(@ModelAttribute("lecture")Lecture  m)
{
	lecture.save(m);
	return "index";
}
}
