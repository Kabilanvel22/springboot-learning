package com.example.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Status;
import com.example.Service.StatusService;

@RestController
@RequestMapping("/status")
public class StatusControl {
	
	@Autowired
	StatusService statusService;
	
	@PostMapping("")
	private Status submitStatus(@RequestBody Status status)
	{
		return statusService.submitDataIntoDB(status);
	}
	
	@GetMapping("")
	private ArrayList<Status>getAllStatus()
	{
		return statusService.retrieveStatus();
	}

}
