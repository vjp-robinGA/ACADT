package com.iesvjp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldControllerEj3 {
	private static final String EJ3HELLOWORLD_VIEW = "helloWorldEj3";
	
	//localhost:9000/helloWorld/request4
	@GetMapping("/request4")
	public ModelAndView request4() {
		
		Persona persona = new Persona("Robin", "Gonzalez", 20);
		
		ModelAndView mav = new ModelAndView(EJ3HELLOWORLD_VIEW);
		mav.addObject("persona", persona);
		return mav;
	}
	
	
}

