package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
   
	@Value("$(app.name : kabilan)")
	private String name;
	@RequestMapping("/hi")
	public String helo()
	{
		return "hello" + name;
	}
}
