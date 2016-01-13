package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Product;


public class Insert {

	public static void main(String[] args) {


		Product product=new Product();  // Transient
		product.setId(125);
		product.setName("Mac Pro");
		product.setPrice(2000.00);

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(product);  // persistent
		
		product.setPrice(2000.00);

		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
