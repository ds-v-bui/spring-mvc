package com.java.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//The @Controller annotation marks this class as Controller.
@Controller
public class HelloController {

	//The @Requestmapping annotation is used to map the class with the specified URL name.
	@RequestMapping("/")
	public String display() {
		return "index";
	}
}
