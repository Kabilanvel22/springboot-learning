package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.dealer;
import com.example.demo.Service.dealerService;

@RestController
@RequestMapping("/dealer")
public class dealerControll {

	@Autowired
	dealerService Dealer;
	@PostMapping("/userfarm")
    public dealer createDealer(@RequestBody dealer deal) {
        return Dealer.createDealer(deal);
    }
	@GetMapping("/getDealer")
	public List<dealer> getAllDealer()
	{
		return Dealer.getAllDealer();
	}
	
}
