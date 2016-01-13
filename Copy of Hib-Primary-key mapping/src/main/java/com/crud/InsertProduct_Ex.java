package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
import com.model.Product;
import com.model.ProductID;

public class InsertProduct_Ex {

	public static void main(String[] args) {

		ProductID id=new ProductID();
		id.setProdNum(4234234);
		id.setType("ELEC");
		
		Product product=new Product();
		product.setId(id);
		product.setName("Mac Pro");

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(product);

		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
