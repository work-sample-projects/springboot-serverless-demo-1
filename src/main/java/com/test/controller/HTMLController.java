package com.test.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLController {

	@RequestMapping("/")
	public String landingPage(final Map<String, Object> model) {
		
		model.put("message", "Hello World");

		// Return the landing page
		return "landing";
	}
}
