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

public class Batch_Insert {

	public static void main(String[] args) {

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		for (int i = 0; i <= 100; i++) {
			Book book = new Book();
			book.setIsbn(i);
			book.setName("Book-" + i);

			session.save(book);

			if (i == 50) {
				session.flush();
				session.clear();
				System.out.println("-------------");
			}
			
		}
		
		System.out.println("Batch-Insert process finished....");

		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
