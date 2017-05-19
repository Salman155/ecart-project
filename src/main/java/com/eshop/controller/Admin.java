package com.eshop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.eshop.model.AdminDetails;


@Controller
public class Admin
{  
	@RequestMapping("/admin")
     String goAdmin()
	{
	 return "adminHome";	
	}
	
	
	}

