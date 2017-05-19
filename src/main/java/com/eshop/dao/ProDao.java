package com.eshop.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eshop.model.ProductDetails;
@Repository
public class ProDao {
@Autowired
SessionFactory sessionfactory;
  public void proDetails(ProductDetails p)
  {
  Session s=sessionfactory.openSession();
  Transaction t=s.beginTransaction();
  s.save(p);
  t.commit();
  s.close();
	}
  
  public List retriveProduct()
	{
		Session session=sessionfactory.openSession();
		Transaction t=session.beginTransaction();
		
		String hql="from ProductDetails";
		Query query =session.createQuery(hql);
		List results=query.list();
		System.out.println(results);
		session.close();
		return results;
	}
  
  public void deleteProduct(int productid)
  {
	  Session session=sessionfactory.openSession();
		Transaction t=session.beginTransaction();
		ProductDetails p=(ProductDetails)session.get(ProductDetails.class,productid);
		session.delete(p);
		t.commit();
		session.close();
  }
}