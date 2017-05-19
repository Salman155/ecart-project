package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CatDao;
import com.eshop.model.AdminDetails;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;

@Controller
public class Category
{
	
	
	@Autowired
	CatDao cd;
	
	@RequestMapping(value="/cat",method=RequestMethod.GET)
	public ModelAndView cat()
	{
		CategoryDetails c=new CategoryDetails();
		List l=cd.retriveCategory();
		ModelAndView mv=new ModelAndView("category","CategoryDetails",c);
		mv.addObject("catData",l );
		return mv;
	}
	
	@RequestMapping(value="/cat",method=RequestMethod.POST)
	public ModelAndView cat1(@ModelAttribute("CategoryDetails") CategoryDetails c)
	{
		
		CategoryDetails c1=new CategoryDetails();
		List l=cd.retriveCategory();
		ModelAndView mv=new ModelAndView("category","CategoryDetails",c1);
		cd.insertDetails(c);
		mv.addObject("catData",l );
		return mv;
	}
	
	@RequestMapping("/deladcat")
	public ModelAndView deleteprod(@RequestParam("adcid")int cid)
	{
		cd.deleteCategory(cid);
		List l=cd.retriveCategory();
		CategoryDetails c1=new CategoryDetails();
		ModelAndView mv=new ModelAndView("category","CategoryDetails",c1);
		mv.addObject("catData",l );
		return mv;
	}
	
	
}
