package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.RegDao;
import com.eshop.model.AdminDetails;
import com.eshop.model.UserDetails;

@Controller
public class Register
{   @Autowired
	RegDao rd;
	
	
	@RequestMapping(value="/reg",method=RequestMethod.GET)
	public ModelAndView adm()
	{
		UserDetails u=new UserDetails();
		ModelAndView mv=new ModelAndView("register","UserDetails",u);
		return mv;
	}
	
	@RequestMapping("/home")
	public String hm()
	{
		return "index1";
	}
	
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	public ModelAndView req1(@ModelAttribute("UserDetails")UserDetails u)
	{
		ModelAndView mv=new ModelAndView("registersucess","UserDetails",u);
		rd.insertUser(u);
		return mv;
	
	}
	
	
	}

