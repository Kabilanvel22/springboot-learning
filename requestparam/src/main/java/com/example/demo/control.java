package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class control {
    @GetMapping("/home")
	public String demo(@RequestParam String name,@RequestParam(required=false) String dept)
	{
		return "hi"+name+dept;
	}
}
