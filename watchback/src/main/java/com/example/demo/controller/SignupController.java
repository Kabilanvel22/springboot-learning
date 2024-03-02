package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Signup;
import com.example.demo.repository.SignupRepo;





@RestController
@CrossOrigin
@RequestMapping("/signup")
public class SignupController {
	@Autowired SignupRepo repo;
	@PostMapping("/post")
	private Signup PostUser(@RequestBody Signup s){
		return repo.save(s);
	}
}

