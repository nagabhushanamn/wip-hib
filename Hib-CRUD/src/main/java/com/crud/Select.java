package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Product;

/*
 * 
 *  In Hibernate , entity selection can d in 4 ways
 *  
 *  --> by primary key ( session.get() | session.load() )
 *  --> HQL ( Hibernate Query Language )
 *  --> Criteria API
 *  --> Native SQL
 * 
 */

public class Select {

	public static void main(String[] args) {

	
		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Product product = (Product) session.get(Product.class, 12); // Persistent
		System.out.println(product);
		
		product.setPrice(3000.00);
		
		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
