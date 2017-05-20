package com.eshop.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.controller.Category;
import com.eshop.model.CategoryDetails;
import com.eshop.model.ProductDetails;




@Repository
public class CatDao 
{
	@Autowired
	SessionFactory sessionFactory;
	public void insertDetails(CategoryDetails cc)
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.saveOrUpdate(cc);
		t.commit();
		session.close();
	}
	
	public List retriveCategory()
	{
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		String hql="from CategoryDetails";
		Query query =session.createQuery(hql);
		List results=query.list();
		System.out.println(results);
		session.close();
		return results;
	}
	
	 public void deleteCategory(int cid)
	  {
		  Session session=sessionFactory.openSession();
			Transaction t=session.beginTransaction();
			CategoryDetails c=(CategoryDetails)session.get(CategoryDetails.class,cid);
			session.delete(c);
			t.commit();
			session.close();
	  }
	 
	 public  CategoryDetails editCategory(int cid)
	  {
		  Session session=sessionFactory.openSession();
			Transaction t=session.beginTransaction();
			CategoryDetails c=(CategoryDetails)session.get(CategoryDetails.class,cid);
			return c;
	  }
}
 