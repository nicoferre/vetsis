package com.mrgss.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mrgss.web.persistence.model.RoleEntity;
import com.mrgss.web.persistence.model.UserEntity;
import com.mrgss.web.persistence.repository.RoleRepository;
import com.mrgss.web.persistence.repository.UserRepository;

@Controller
public class MainController {

	@Autowired
	UserRepository repositoryUser;
	
	@Autowired
	RoleRepository repositoryRole;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		newUser();
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		return model;
	}

	//TODO
	private void newUser() {
		
		try{
		RoleEntity role;
		role = new RoleEntity();
		role.setName("Administrador");
		role = repositoryRole.save(role);

		System.out.println(role.toString());
		
		UserEntity user = new UserEntity();
		user.setActive(true);
		user.setPassword("nicoferre");
		user.setUsername("nicoferre");
		user.setRole(role);
		user = repositoryUser.save(user);
		
		System.out.println(user.toString());
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
