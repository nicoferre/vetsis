package com.mrgss.web.controller;

import javax.servlet.http.HttpSession;

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
	public ModelAndView login(@RequestParam("userName") String username,
			@RequestParam("password") String password, ModelAndView model) {
		try {
			UserEntity user = userService.login(username, password);

			model.addObject("user", user);
			model.setViewName("home");

		} catch (Exception e) {
			model.setViewName("error");
		}
		return model;
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView home(HttpSession session, ModelAndView model) {
		UserEntity user = (UserEntity) session.getAttribute("user");
		if (user != null) {
			model.addObject("user", user);
			model.setViewName("home");
		} else {
			model.setViewName("login");
		}
		return model;
	}
}
