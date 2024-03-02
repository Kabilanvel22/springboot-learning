package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.SignUpService;
import com.example.demo.model.SignUp;



@RestController
@CrossOrigin
@RequestMapping("/login")

public class LoginController {

	
	@Autowired 
	SignUpService ser;
	@GetMapping("/get")
	private Iterable<SignUp> GetUsers(){
		return ser.GetAll();
	}
	
}
