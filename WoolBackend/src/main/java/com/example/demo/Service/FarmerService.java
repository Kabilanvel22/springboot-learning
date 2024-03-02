package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Farmer;
import com.example.demo.Repository.FarmerRepository;

@Service
public class FarmerService {

	@Autowired
	FarmerRepository farmerRepository;
	public Farmer createFarmer(Farmer farmer)
	{
		return farmerRepository.save(farmer);
	}
}
