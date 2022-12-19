package com.codefromlaks.learn.springboot.demo.myfirstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class MyfirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstSpringAppApplication.class, args);
	}

}
