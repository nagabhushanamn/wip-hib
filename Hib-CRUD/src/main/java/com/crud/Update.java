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

public class Update {

	public static void main(String[] args) {

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// Req-1
		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Product product = (Product) session.get(Product.class, 12); // Persistent

		session.getTransaction().commit();
		session.close(); // Detached
		// -------------------------------------------

		System.out.println("--------------------------");
		
		product.setPrice(6000.00);  // Dtached state

		// Req-2
		// ----------------------------------------------
		session = sessionFactory.openSession();
		session.getTransaction().begin();

		//session.update(product);
		session.merge(product);
		
		session.getTransaction().commit();
		session.close();
		// -------------------------------------------

		sessionFactory.close();
	}

}
