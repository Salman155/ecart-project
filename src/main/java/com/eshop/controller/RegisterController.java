package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegDao;
import com.eshop.model.UserCredentials;
import com.eshop.model.UserDetails;

@Controller
public class RegisterController
{
	
	
	
	
	@Autowired
	RegDao rd;
	
	
	
	@RequestMapping(value="home",method=RequestMethod.GET)
	String home()
	{
	 
	  
	  return "index1";
	}
	
	
	
  @RequestMapping(value="/register",method=RequestMethod.GET)
	ModelAndView reg1()
	{
	  UserDetails u=new UserDetails();
	  ModelAndView mv=new ModelAndView("register","UserDetails",u);
	  
	  return mv;
	}

 
  
  @RequestMapping(value="/register",method=RequestMethod.POST)
	ModelAndView reg2(@ModelAttribute("UserDetails") UserDetails u)
	{
	
	  ModelAndView mv=new ModelAndView("registersucess","UserDetails",u);
	  
	  UserCredentials uc=new UserCredentials();
	  uc.setUsername(u.getUserName());
	  uc.setPassword(u.getPassword());
	  uc.setRole("ROLE_USER");
	  uc.setEnabled(true);
	  rd.insertUserCredentails(uc);
	  rd.insertUser(u);
	  
	  return mv;
	}
  
  
  
  
}

