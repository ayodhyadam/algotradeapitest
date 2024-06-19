package com.gyantey.algotradeapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyantey.algotradeapi.entities.BrokerRegistration;
import com.gyantey.algotradeapi.repository.BrokerRegistrationRepository;

@Service
public class BrokerRegistrationService {
	
	@Autowired
	private BrokerRegistrationRepository  brokerRegistrationRepository;
	
	public BrokerRegistration getBroker()
	{
		return brokerRegistrationRepository.findAll().get(0);
	}
	
	public BrokerRegistration createBroker(BrokerRegistration broker)
	{
		return brokerRegistrationRepository.save(broker);
	}
}
