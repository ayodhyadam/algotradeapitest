package com.gyantey.uamapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gyantey.uamapi.entities.Action;
import com.gyantey.uamapi.service.ActionService;

@RestController
@RequestMapping("/uamapi")
public class UAMAPIController {
	
	@Autowired
	private ActionService actionService;
	
	@PostMapping("/action/create")
	public boolean createAction(Action action)
	{
		
		String action2 = actionService.getAction();
		
		System.out.println(action2);
		return true;
	}
	
	@GetMapping("/action/get")
	public boolean getAction(Action action)
	{
		return true;
	}
	
	
	
	@PostMapping("/action/update")
	public boolean updateAction(Action action)
	{
		return true;
	}
	
	
	@DeleteMapping("/action/delete")
	public boolean deleteAction(Action action)
	{
		return true;
	}

}
