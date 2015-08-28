package com.mrgss.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrgss.web.persistence.model.UserEntity;
import com.mrgss.web.persistence.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public UserEntity login(String username, String password){
		return repository.findByUsernameAndPassword(username, password);
		
	}
	
//	public UserEntity buildUser(String name, String password) {
//		UserEntity user = new UserEntity();
//		user.setUsername(name);
//		user.setPassword(password);
//		user = repository.save(user);
//		System.out.println(user.getId());
//		return user;
//	}
}
