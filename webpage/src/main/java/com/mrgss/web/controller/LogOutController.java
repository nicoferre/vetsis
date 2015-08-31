package com.mrgss.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogOutController {

	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public ModelAndView invalidate(HttpSession session, ModelAndView model) {
	  session.invalidate();
	  model.setViewName("login");
	  return model;
	}
}
