package com.iesvjp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ejemplo")
public class HelloWorldController {
	public static final String HELLO_WORLD_VIEW = "helloWorld";

	// primera forma
	@GetMapping("/")
	public String index() {
		return HELLO_WORLD_VIEW;
	}

	// primera forma
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return HELLO_WORLD_VIEW;
	}

	// segunda forma
	@GetMapping("/helloWorldMAV")
	public ModelAndView helloWorldMAV() {
		return new ModelAndView(HELLO_WORLD_VIEW);
	}
}
	