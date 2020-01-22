package com.dtel.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dtel.demo.model.User;
import com.dtel.demo.service.UserManagementService;

@RestController
public class UserController {
	
	
	@Autowired
	UserManagementService userManagementService;
	
	@ResponseBody
	@RequestMapping(value="/getUser/{id}",method=RequestMethod.GET)
	 public User findById(@PathVariable("id") Long id) {

	        return userManagementService.findById(id);
	    }

	
	@RequestMapping( value="/registerUser",method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	User registerUser(@RequestBody User user){
		return userManagementService.createUser(user);
	}
	
}
