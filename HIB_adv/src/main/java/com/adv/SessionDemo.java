package com.adv;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

import com.model.Book;
import com.model.Chapter;
import com.model.Publisher;

public class SessionDemo {

	public static void main(String[] args) {

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.getCurrentSession();
//		session.getTransaction().begin();

		Book book = (Book) session.get(Book.class, 234234);

		// -----------------------------------------------
		
		
		session = sessionFactory.getCurrentSession();
		//session.getTransaction().begin();

		book = (Book) session.get(Book.class, 234234);

		session.getTransaction().commit();
		//session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
