package com.iesvjp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldControllerEj4 {
	private static final String EJ4HELLOWORLD_VIEW = "helloWorldEj4";
	
	//localhost:9000/helloWorld/request5
	@GetMapping("/request5")
	public ModelAndView request5() {
		
		Persona persona = new Persona("Robin", "Gonzalez", 20);
		
		ModelAndView mav = new ModelAndView(EJ4HELLOWORLD_VIEW);
		mav.addObject("persona", persona);
		return mav;
	}
	
	
}

