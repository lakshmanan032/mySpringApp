package com.codefromlaks.learn.springboot.demo.myfirstspringapp.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@RequestMapping("/")
	public String homePage() {
		return "Welcome Home";
	}
}
