package com.test.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String landingPage(Map<String, Object> model) {
		model.put("message", "Hello World");
		
		//Return the landing page
		return "landing";
	}
}
