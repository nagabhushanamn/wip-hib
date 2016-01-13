package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Boy;

public class SelectBoy {

	public static void main(String[] args) {

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Boy boy = (Boy) session.get(Boy.class, 11);
		System.out.println(boy.getName());
		System.out.println("----------------------");
		
		System.out.println(boy.getGirl().getName());  // Lazy Initialization

		session.getTransaction().commit();
		session.close();
		
		
		
		// -------------------------------------------
		sessionFactory.close();
	}

}
