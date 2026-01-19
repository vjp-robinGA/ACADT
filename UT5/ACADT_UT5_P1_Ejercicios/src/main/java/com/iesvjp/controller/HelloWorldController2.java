package com.iesvjp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController2 {
	private static final String HELLOWORLD_VIEW = "helloWorld2";

	//localhost:9000/helloWorld/request1?nm=Ana
	@GetMapping("/request1")
	public ModelAndView request1(
			@RequestParam(name = "nm", required = false, defaultValue = "World") 
			String name) {
		ModelAndView mav = new ModelAndView(HELLOWORLD_VIEW);
		mav.addObject("name_model", name);
		return mav;
	}

	//FORMA 2
	//localhost:9000/helloWorld/request2/Ana
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name) {
		ModelAndView mav = new ModelAndView(HELLOWORLD_VIEW);
		mav.addObject("name_model", name);
		return mav;
	}
	
}

