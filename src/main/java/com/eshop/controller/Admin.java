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
    public String goAdmin()
	{
	 return "adminHome";	
	}
	
	@RequestMapping("/contact")
    public String contact()
	{
	 return "Contact";	
	}
	
	@RequestMapping("/aboutus")
    public String aboutus()
	{
	 return "aboutus";	
	}
	
	
	
	}

