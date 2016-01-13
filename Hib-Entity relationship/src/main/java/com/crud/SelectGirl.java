package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Girl;

public class SelectGirl {

	public static void main(String[] args) {

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Girl girl=(Girl)session.get(Girl.class, 22);
		System.out.println(girl.getName());
		System.out.println(girl.getBoy().getName());
		
		session.getTransaction().commit();
		session.close();
		
		
		
		// -------------------------------------------
		sessionFactory.close();
	}

}
