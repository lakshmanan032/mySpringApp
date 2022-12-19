package com.codefromlaks.learn.springboot.demo.myfirstspringapp.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyApplicationController {

	@RequestMapping("/mvc")
	public String home() {
		return "index";
	}
}
