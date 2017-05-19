package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class SupplierDetails 
{
	@Id
	
	@Column(name = "SId")
	private int sId;
	
  @Column(name = "SName")
	private String sName;



public int getsId() {
	return sId;
}

public void setsId(int sId) {
	this.sId = sId;
}

public String getsName() {
	return sName;
}

public void setsName(String sName) {
	this.sName = sName;
}

public String getsDis() {
	return sDis;
}

public void setsDis(String sDis) {
	this.sDis = sDis;
}

	@Column(name = "SDis")
	private String sDis;


}
