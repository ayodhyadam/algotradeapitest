package com.gyantey.uamapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyantey.uamapi.repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	public LoginRepository  loginRepository;
	
	public boolean varifyLoginInfoService(String userid, String password)
	{
		boolean varifyLoginInfoRepository = loginRepository.varifyLoginInfoRepository(userid, password);
		
		
		return varifyLoginInfoRepository;
		
	}

}
