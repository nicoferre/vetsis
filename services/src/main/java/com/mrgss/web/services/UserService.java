package com.mrgss.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrgss.web.persistence.model.PersistentUser;
import com.mrgss.web.persistence.repository.UsersRepository;

@Service
public class UserService {

	@Autowired
	UsersRepository repository;

	public PersistentUser getUserByName(final String name) {
		return null;
	}

	public PersistentUser buildUser(String name, String password) {
		PersistentUser user = new PersistentUser();
		user.setName(name);
		user.setPassword(password);
		user = repository.save(user);
		System.out.println(user.getId());
		return user;
	}
}
