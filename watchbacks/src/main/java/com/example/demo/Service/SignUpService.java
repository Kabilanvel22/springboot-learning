package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.SignUp;
import com.example.demo.repository.SignUpRepo;

public class SignUpService {

	@Autowired 
	SignUpRepo repo;

	public Iterable<SignUp> GetAll(){
		return repo.findAll();
	}
	
	
}
