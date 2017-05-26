package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CategoryDetails;
import com.eshop.model.SupplierDetails;



@Repository
public class SupplierDao
{
	@Autowired
	SessionFactory sessionFactory;
	public void insertSup(SupplierDetails ss)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		System.out.println(ss.getsId());
		session.saveOrUpdate(ss);
		//System.out.println(cc.getCategorydescription()+""+cc.getCategoryid());
		t.commit();
		session.close();
	}
	public List retireveSupplier()
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		String hql="from SupplierDetails";
		Query query=session.createQuery(hql);
		List l =query.list();
		System.out.println(l);
		session.close();
		return l;
	}
	
	 public void deleteSupplier(int sid)
	  {
		  Session session=sessionFactory.openSession();
			Transaction t=session.beginTransaction();
			System.out.println(sid);
			SupplierDetails s=(SupplierDetails)session.get(SupplierDetails.class,sid);
			session.delete(s);
			
			t.commit();
			session.close();
	  }
	 
	 public SupplierDetails editSupplier(int sid)
	  {
		  Session session=sessionFactory.openSession();
			Transaction t=session.beginTransaction();
			System.out.println(sid);
			SupplierDetails s=(SupplierDetails)session.get(SupplierDetails.class,sid);
			return s;
	  }
	
	}


