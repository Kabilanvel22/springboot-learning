package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@Autowired
	dataservice Dataservice;

	@GetMapping("/data")  
	private List<datas> getAlldatas()   
	{  
	return Dataservice.getAlldatas();  
	}  
	
	@GetMapping("/data/{id}")  
	private datas getdatas(@PathVariable("id") int id)   
	{  
	return Dataservice.getdatasById(id);  
	}  
 
	@DeleteMapping("/data/{id}")  
	private void deleteData(@PathVariable("id") int id)   
	{  
		Dataservice.delete(id);  
	}  

	@PostMapping("/data")  
	private int saveData(@RequestBody datas Data)   
	{  
		Dataservice.saveOrUpdate(Data);  
	return Data.getId();  
	}  
	   
	@PutMapping("/data")  
	private datas update(@RequestBody datas Data)   
	{  
		Dataservice.saveOrUpdate(Data);  
	return Data;  
	}  
	  
	
}

