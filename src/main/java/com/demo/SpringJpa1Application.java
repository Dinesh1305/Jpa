package com.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.repo.UseDataBase;

@SpringBootApplication
public class SpringJpa1Application {

	public static void main(String[] args) {
		  ApplicationContext context = SpringApplication.run(SpringJpa1Application.class, args);

	        // ✅ Manually get the UseDataBase bean from the Spring context
	        UseDataBase e = context.getBean(UseDataBase.class);
	       // e.use(); //
	     //  e.insert();
	        
	        
	        
	       
	}

}
