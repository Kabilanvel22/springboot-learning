package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Signup;
import com.example.demo.repository.SignupRepo;


@Service
public class SignupService {

	@Autowired 
	SignupRepo repo;

	public Iterable<Signup> GetAll(){
		return repo.findAll();
	}
	
}
