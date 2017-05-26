package com.eshop.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CategoryDao;
import com.eshop.dao.ProductDao;
import com.eshop.dao.SupplierDao;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;
import com.eshop.model.SupplierDetails;

@Controller
public class ProductController 
{
	@Autowired
	SupplierDao sd;
	
	@Autowired
	ProductDao pd;
	
	@Autowired
	CategoryDao cd;
	
	@RequestMapping(value="/pro",method=RequestMethod.GET)
	public ModelAndView pro()
	{
		ProductDetails p=new ProductDetails();
		
		List l=cd.retriveCategory();
		/*Iterator i=l.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			CategoryDetails c1=(CategoryDetails)o;
			System.out.println(c1.getCategorydescription());
		}*/
	
		
		List l1=sd.retireveSupplier();
		/*Iterator i1=l1.iterator();
		while(i1.hasNext())
		{
			Object o=i1.next();
			SupplierDetails s1=(SupplierDetails)o;
			System.out.println(s1.getSdis());
		}*/
		List l2=pd.retriveProduct();
		ModelAndView mv=new ModelAndView("product","ProductDetails",p);
		mv.addObject("catData",l );
		mv.addObject("supData",l1);
		mv.addObject("proData",l2);
		mv.addObject("bname", "ADD Product");
		return mv;
	}
	
	@RequestMapping(value="/pro",method=RequestMethod.POST)
	public ModelAndView prodet(@ModelAttribute("ProductDetails") ProductDetails p)
	{
		List l=cd.retriveCategory();
		List l1=sd.retireveSupplier();
		List l2=pd.retriveProduct();
		System.out.println(l1);
		ProductDetails p1=new ProductDetails();
		ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
		mv.addObject("catData",l );
		mv.addObject("supData",l1);
		mv.addObject("proData",l2);
		mv.addObject("bname", "ADD Product");
		pd.proDetails(p);
	
		
	String path="E:\\Web Project\\ecart\\src\\main\\webapp\\resources\\image\\";
	path=path+String.valueOf(p.getProductId())+".jpg";
	MultipartFile file=p.getPimage();
	File f=new File(path);
	try {
		FileOutputStream fos=new FileOutputStream(f);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		byte[] b=file.getBytes();
		bos.write(b);
		bos.close();
	} 
	catch (Exception e)
	{
		
	}
	
	return mv;
}
	@RequestMapping("/deladprod")
	public ModelAndView deleteprod(@RequestParam("adpid")int pid)
	{
		pd.deleteProduct(pid);
		List l=cd.retriveCategory();
		List l1=sd.retireveSupplier();
		List l2=pd.retriveProduct();
		ProductDetails p1=new ProductDetails();
		ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
		mv.addObject("catData",l );
		mv.addObject("supData",l1);
		mv.addObject("proData",l2);
		mv.addObject("bname", "ADD Product");
		return mv;
	}
	
	
	@RequestMapping("/deladprod1")
	public ModelAndView editprod(@RequestParam("adpid1")int pid)
	{
		ProductDetails p1=	pd.editProduct(pid);
		List l=cd.retriveCategory();
		List l1=sd.retireveSupplier();
		List l2=pd.retriveProduct();
		
		ModelAndView mv=new ModelAndView("product","ProductDetails",p1);
		mv.addObject("catData",l );
		mv.addObject("supData",l1);
		mv.addObject("proData",l2);
		mv.addObject("bname", "Update Product");
		return mv;
	}
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public ModelAndView pro1()
	{
		ProductDetails p=new ProductDetails();
		
		
		List l2=pd.retriveProduct();
		ModelAndView mv=new ModelAndView("prohome","ProductDetails",p);
		
		mv.addObject("proData",l2);
		
		return mv;
	}
	
	@RequestMapping(value="/image",method=RequestMethod.GET)
	public ModelAndView getImage(@RequestParam("img")int pImage)
	{
		ProductDetails p=pd.editProduct(pImage);
		List l=new ArrayList();
		l.add(p); 
		ModelAndView mv=new ModelAndView("single","ProductDetails",l);
		return mv;
	}
	
	
		
	
}
