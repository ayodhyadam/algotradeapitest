package com.gyantey.uamapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	
	
	@GetMapping("/msg")
	String getMessage()
	{
		return "Hello Sumit Ji : ";
	}
	
	
	@GetMapping("/home")
	String homePage()
	{
		return "HomePage  : ";
	}

}
