package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eshop.dao.CartDao;
import com.eshop.dao.CategoryDao;
import com.eshop.dao.ProductDao;
import com.eshop.dao.SupplierDao;
import com.eshop.model.CartDetails;
import com.eshop.model.ProductDetails;

@Controller
public class CartController 

{
	
	@Autowired
	ProductDao pd;
	
	@Autowired
	CartDao cad;
	
	
	@RequestMapping(value="cart",method=RequestMethod.GET)
	public ModelAndView addCart(@RequestParam("pid")int id)
	{
		ProductDetails p=pd.editProduct(id);
		CartDetails c=new CartDetails();
	
		c.setCartUser("doll");
		c.setProId(p.getProductId());
		c.setProname(p.getProductName());
		c.setProPrice(p.getProductPrice()*1);
		cad.insertCart(c);
		List cartList=cad.retrieveCart();
		ModelAndView mv=new ModelAndView("cart","CartData",cartList);
		return mv;
		
		
		
	}

}
