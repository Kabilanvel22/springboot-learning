package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.producer;
import com.example.demo.Service.producerService;

@RestController
@RequestMapping("/producer")
public class producerControll {

	@Autowired
	producerService prodService;
	@PostMapping("/userfarm")
    public producer createProducer(@RequestBody producer Prod) {
        return prodService.createProducer(Prod);
    }
	@GetMapping("/getfarm")
	public List<producer> getAllProducer()
	{
		return prodService.getAllProducer();
	}
	
}
