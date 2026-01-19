package com.iesvjp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldControllerEj2 {
	private static final String EJ2HELLOWORLD_VIEW = "helloWorldEj2";
	
	//localhost:9000/helloWorld/request1?nomb=Robin&apell=Gonzalez&edad=20
	@GetMapping("/request3")
	public ModelAndView request3(
			
			@RequestParam(name = "nomb", required = false, defaultValue = "Nulo") String nombre, 
			@RequestParam(name= "apell", required = false, defaultValue = "Nulo") String apellidos, 
			@RequestParam(name = "edad", required = false, defaultValue = "Nulo") int edad) {
		
		ModelAndView mav = new ModelAndView(EJ2HELLOWORLD_VIEW);
		mav.addObject("nombre", nombre);
		mav.addObject("apellidos" , apellidos);
		mav.addObject("edad", edad);
		return mav;
	}
	
	
}

