package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.SupDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;

@Controller
public class Supplier 
{
	@Autowired
	SupDao sd;
	@RequestMapping(value="/supp",method=RequestMethod.GET)
	public ModelAndView supp()
	{
		SupplierDetails s=new SupplierDetails();
		List l1=sd.retireveSupplier();
		ModelAndView mv=new ModelAndView("supplier","SupplierDetails",s);
		mv.addObject("supData",l1);
		return mv;
	}
	
	@RequestMapping(value="/supp",method=RequestMethod.POST)
	public ModelAndView supp1(@ModelAttribute("SupplierDetails")SupplierDetails s)
	{
		sd.insertSup(s);
		SupplierDetails s1=new SupplierDetails();
		List l1=sd.retireveSupplier();
		ModelAndView mv=new ModelAndView("supplier","SupplierDetails",s1);
		
		System.out.println(s.getsId());
		mv.addObject("supData",l1);
		return mv;
	}
	
	@RequestMapping("/deladsup")
	public ModelAndView deleteprod(@RequestParam("adsid")int sid)
	{
		sd.deleteSupplier(sid);
		SupplierDetails s1=new SupplierDetails();
		List l1=sd.retireveSupplier();
		ModelAndView mv=new ModelAndView("supplier","SupplierDetails",s1);
		mv.addObject("supData",l1);
		return mv;
	}
	
}
