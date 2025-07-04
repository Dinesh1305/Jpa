package com.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controllers {
	


@GetMapping("/")
public String index(){
	return "index";
}





@GetMapping("SectionForm")
public String Section()
{
	return "section";
}

}
