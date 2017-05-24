package com.eshop.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.CartDetails;

@Repository
public class CartDao
{
	@Autowired

	SessionFactory sessionFactory;
	
	public List retrieveCart()
	{
		System.out.println("in retrieve product");
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		
		String hql="FROM CartDetails";
		Query query=session.createQuery(hql);
		List result=query.list();
		session.close();
		return result;
	}
	
	public void insertCart(CartDetails c)
	{
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		s.save(c);
		t.commit();
		s.close();
	}
}
