package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.SupplierDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;

@Controller
public class SupplierController 
{
	@Autowired
	SupplierDao sd;
	@RequestMapping(value="/supp",method=RequestMethod.GET)
	public ModelAndView supp()
	{
		SupplierDetails s=new SupplierDetails();
		List l1=sd.retireveSupplier();
		ModelAndView mv=new ModelAndView("supplier","SupplierDetails",s);
		mv.addObject("supData",l1);
		mv.addObject("bname", "ADD Supplier");
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
		mv.addObject("bname", "ADD Supplier");
		return mv;
	}
	

	@RequestMapping("/deladsup1")
	public ModelAndView editprod(@RequestParam("adsid1")int sid)
	{
	
		SupplierDetails s1=sd.editSupplier(sid);
		List l1=sd.retireveSupplier();
		ModelAndView mv=new ModelAndView("supplier","SupplierDetails",s1);
		mv.addObject("supData",l1);
		mv.addObject("bname", "Update Supplier");
		return mv;
	}
	
}
