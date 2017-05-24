package com.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.model.UserCredentials;
@Controller
public class loginController
{
	@Autowired
	
	@RequestMapping(value="/logn",method=RequestMethod.GET)
	public ModelAndView getlog()
	{
		UserCredentials uc=new UserCredentials();
		ModelAndView mv=new ModelAndView("login","UserCredentials",uc);
		return mv;
	}

}
