package com.gyantey.algotradeapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyantey.algotradeapi.entities.AlgoTrade;

@RestController
@RequestMapping("/trade")
public class AlgoTradeController 
{
	
	@PostMapping("/create")
	public AlgoTrade  createTrade(AlgoTrade AlgoTrade)
	{
		return null;
	}
	
	@PostMapping("/update")
	public AlgoTrade  updateTrade(AlgoTrade AlgoTrade)
	{
		// Get the trade and update 
		
		return null;
	}
	
	
	@PostMapping("/cancel")
	public AlgoTrade  cancelTrade(AlgoTrade AlgoTrade)
	{
		// Get the trade and update 
		
		return null;
	}
	
	@GetMapping("/get")
	public AlgoTrade  getTrade(AlgoTrade AlgoTrade)
	{
		// Get the trade and update 
		
		return null;
	}
	
	
	// Home 
	
	@GetMapping("/")
	public String getHelloMsg()
	{
		return "Hello, This App is working fine";
	}

}
