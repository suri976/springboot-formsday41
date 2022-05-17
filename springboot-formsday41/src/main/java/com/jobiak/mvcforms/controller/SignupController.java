package com.jobiak.mvcforms.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvcforms.model.User;
import com.jobiak.mvcforms.repository.UserRepository;

import ch.qos.logback.classic.Logger;

@Controller
public class SignupController {

	@Autowired
	UserRepository repo;
	
	//Logger logger = LoggerFactory.getLogger(getClass(SignupController.class));
	
	
	
	public SignupController() {
		// TODO Auto-generated constructor stub
	}

	public SignupController(UserRepository repo) {
		
		this.repo = repo;
	}

	@RequestMapping(path="/test",method = RequestMethod.GET)
	public String redirect()
	{
		return "signup";
	}
	
	@RequestMapping(path="/signup",method = RequestMethod.POST)
	public String doSignUp(@ModelAttribute("user")User user)
	{
		repo.save(user);
		return "success";
		
		
		
		
	}
	
}
