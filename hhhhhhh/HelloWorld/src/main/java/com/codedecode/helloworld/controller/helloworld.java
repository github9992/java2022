package com.codedecode.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {
	
	@RequestMapping("/hai")
	public String hello() {
		return "wello come to the spring boot application";
	}

}
