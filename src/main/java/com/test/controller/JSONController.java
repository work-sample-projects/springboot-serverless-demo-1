package com.test.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class JSONController {

	@GetMapping("/testGet")
	public String testGet() {
		return "{}";
	}

	@PutMapping("/testPut/{name}")
	public String testPut(@PathVariable final String name) {
		return "{name:" + name + "}";
	}

	@PostMapping("/testPost/{name}")
	public String testPost(@PathVariable final String name) {
		return "{name:" + name + "}";
	}
}
