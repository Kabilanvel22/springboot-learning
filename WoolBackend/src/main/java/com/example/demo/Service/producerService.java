package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.producer;
import com.example.demo.Repository.producerRepository;


@Service
public class producerService {

	@Autowired
	producerRepository prodRepo;;
	public producer createProducer(producer Prod)
	{
		return prodRepo.save(Prod);
	}
	public List<producer> getAllProducer()
	{
		return prodRepo.findAll();
	}
	
}
