package com.gyantey.uamapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyantey.uamapi.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService  loginService; 
	
	@GetMapping("/log")
	public boolean varifyLoginInfo(String userid, String password)
	{
		System.out.println("service is called");
		userid="admin";
		password="admin";
		loginService.varifyLoginInfoService( userid, password);
		System.out.println("service is finished");
		return true;
	}

}
