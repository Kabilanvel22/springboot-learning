package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Signup;
import com.example.demo.service.SignupService;




@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {
	@Autowired 
	SignupService ser;
	@GetMapping("/get")
	private Iterable<Signup> GetUsers(){
		return ser.GetAll();
	}

}

