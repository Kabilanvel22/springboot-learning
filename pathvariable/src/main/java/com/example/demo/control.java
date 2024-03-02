package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
    @GetMapping("/hi/{name}/{dept}")
	public String get(@PathVariable("name") String name,@PathVariable("dept") String dept)
	{
		return "hi " + name + dept;
	}
	
}
