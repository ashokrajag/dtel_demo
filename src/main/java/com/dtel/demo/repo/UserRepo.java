package com.dtel.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.dtel.demo.model.User;

public interface UserRepo extends CrudRepository<User, Long>{
	
	
	// CRUD REPO Does All Actions behind the scene
}
