package com.mrgss.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mrgss.web.persistence.model.PersistentUser;
import com.mrgss.web.services.UserService;

@Controller
public class MainController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		PersistentUser user = userService.buildUser("abc", "abc");
		ModelAndView model = new ModelAndView();
		model.setViewName("welcome");
		model.addObject("user", user);
		return model;
	}
}
