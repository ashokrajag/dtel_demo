package com.dtel.demo.service;

import com.dtel.demo.model.User;

public interface UserManagementService {
	
	public User findById(Long id);
	
	public User createUser(User user);
	
}
