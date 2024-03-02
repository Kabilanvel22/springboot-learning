package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.dealer;
import com.example.demo.Repository.dealerRepository;


@Service
public class dealerService {

	@Autowired
	dealerRepository dealerRepo;
	public dealer createDealer(dealer Deal)
	{
		return dealerRepo.save(Deal);
	}
	public List<dealer> getAllDealer()
	{
		return dealerRepo.findAll();
	}
	
}
