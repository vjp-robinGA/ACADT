package com.iesvjp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldControllerEj5 {
	private static final String EJ5HELLOWORLD_VIEW = "helloWorldEj5";
	
	//localhost:9000/helloWorld/request6
	@GetMapping("/request6")
	public ModelAndView request6() {
		
		Persona persona = new Persona("Robin", "Gonzalez", 20);
		
		String[] asignaturas = {"ACADT","PSP","DDI","PMYDM","SSGE","IPE2","ABS","Digitalizacion","Proyecto"};
		
		ModelAndView mav = new ModelAndView(EJ5HELLOWORLD_VIEW);
		mav.addObject("persona", persona);
		mav.addObject("asignaturas", asignaturas);
		return mav;
	}
	
	
}

