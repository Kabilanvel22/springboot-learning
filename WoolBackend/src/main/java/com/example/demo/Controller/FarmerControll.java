package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Farmer;
import com.example.demo.Service.FarmerService;


@RestController
@RequestMapping("/farmers")
public class FarmerControll {

	@Autowired
	FarmerService farmerService;
	@PostMapping("/userfarm")
    public Farmer createFarmer(@RequestBody Farmer farmer) {
        return farmerService.createFarmer(farmer);
    }
	
}
