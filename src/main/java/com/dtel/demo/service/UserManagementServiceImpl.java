package com.dtel.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtel.demo.model.User;
import com.dtel.demo.repo.UserRepo;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	
	@Autowired
	UserRepo userRepo;

	public User findById(Long empId) {
		return userRepo.findById(empId).get();
	}

	public User createUser(User user){

		return userRepo.save(user);
	}

}
