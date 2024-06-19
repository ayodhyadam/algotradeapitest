package com.gyantey.algotradeapi.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="brokerinfo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BrokerRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="brokerId")  // @Column (name="login_name")
	private int brokerId;
	@Column(name="brokerName")
	private String brokerName;
	

	
}
