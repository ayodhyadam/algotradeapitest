package com.gyantey.algotradeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyantey.algotradeapi.entities.BrokerRegistration;
import com.gyantey.algotradeapi.service.BrokerRegistrationService;

@RestController
@RequestMapping("/broker")
public class BrokerAPIRegistration 
{
	@Autowired
	private BrokerRegistrationService brokerRegistrationService;
	
	@GetMapping("/getBroker")
	public BrokerRegistration getBroker()
	{
		BrokerRegistration broker = brokerRegistrationService.getBroker();
		
		return broker;
		
	}
	
	@PostMapping("/createBroker")
	public BrokerRegistration createBroker(@RequestBody BrokerRegistration broker)
	{
		System.out.println(broker.toString());
		BrokerRegistration cbroker = brokerRegistrationService.createBroker(broker);
		System.out.println(cbroker.toString());
		return cbroker;
		
	}

}
