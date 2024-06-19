package com.gyantey.algotradeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyantey.algotradeapi.entities.BrokerRegistration;

public interface BrokerRegistrationRepository extends JpaRepository<BrokerRegistration, Integer> {

}
