package com.crud;

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

public class CriteriaAPI {

	public static void main(String[] args) {

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Criteria criteria = session.createCriteria(Book.class);

		// criteria.add(Restrictions.eq("price", 1000.00));

		// FInd By Example
		Book exBook = new Book();
		exBook.setPrice(1000.00);
		
		Publisher exPublisher = new Publisher();
		exPublisher.setName("Abc Pvt Ltd");
		exBook.setPublisher(exPublisher);

		criteria.add(Example.create(exBook));

		List<Book> books = criteria.list();
		for (Book book : books) {
			System.out.println(book);
		}

		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
