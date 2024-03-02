package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class controller {
	
	@Autowired
	FetchDataService fetchDataService;

	@GetMapping("/getdata")
	List<demo>getUsers(){
		return fetchDataService.findAll();
	}
	
	@PostMapping("/post")
    public demo create(@RequestBody demo d) {
        return fetchDataService.save(d);
    }
	
	
}

