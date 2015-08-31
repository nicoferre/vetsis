package com.mrgss.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.mrgss.web.persistence.model.UserEntity;
import com.mrgss.web.services.UserService;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("userName") String username, @RequestParam("password") String password, ModelAndView model) {
		try{
			UserEntity user = userService.login(username, password);
			System.out.println("ID del user --> " + user.getId());
			
			model.addObject("user", user);
			model.setViewName("home");
			
		} catch (Exception e){
			System.out.println(e.getMessage());
			model.setViewName("error");
		}
		return model;
	}
}
