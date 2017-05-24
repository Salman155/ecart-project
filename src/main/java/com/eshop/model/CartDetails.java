package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class CartDetails 
{
	@Id
	@GeneratedValue
	@Column(name="CartID")
	private int cartId;
	
	@Column(name="CartUser")
	private String cartUser;
	
	@Column(name="ProId")
	private int proId;
	
	@Column(name="ProName")
	private String proname;
	
	@Column(name="ProPrice")       
	private int proPrice;
	
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getCartUser() {
		return cartUser;
	}

	public void setCartUser(String cartUser) {
		this.cartUser = cartUser;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public int getProPrice() {
		return proPrice;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	@Column(name="TotalPrice")
	private int totalprice;

}
	
	
	
	
	
	
	
	
