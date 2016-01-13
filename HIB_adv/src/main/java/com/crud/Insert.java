package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Book;
import com.model.Chapter;
import com.model.Publisher;

public class Insert {

	public static void main(String[] args) {

		Publisher publisher = new Publisher();
		publisher.setId(123);
		publisher.setName("Abc Pvt Ltd");

		Book book1 = new Book();
		book1.setIsbn(234234);
		book1.setName("Book-1");
		book1.setPrice(1000);

		Book book2 = new Book();
		book2.setIsbn(345345);
		book2.setName("Book-2");
		book2.setPrice(2000);

		Book book3 = new Book();
		book3.setIsbn(56756);
		book3.setName("Book-3");
		book3.setPrice(3000);

		Book book4 = new Book();
		book4.setIsbn(46456);
		book4.setName("Book-4");
		book4.setPrice(3000);

		Chapter chapter1 = new Chapter();
		chapter1.setIdx(1);
		chapter1.setName("Intro");

		Chapter chapter2 = new Chapter();
		chapter2.setIdx(2);
		chapter2.setName("Intro");

		book1.getChapters().add(chapter1);
		book1.getChapters().add(chapter2);

		// book2.getChapters().add(chapter1);
		// book2.getChapters().add(chapter2);
		//
		// book3.getChapters().add(chapter1);
		// book3.getChapters().add(chapter2);

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		// session.save(publisher); // persistent

		book1.setPublisher((Publisher) session.load(Publisher.class, 123));
		book2.setPublisher((Publisher) session.load(Publisher.class, 123));
		book3.setPublisher((Publisher) session.load(Publisher.class, 321));
		//
		//
		// session.save(book1);
		// session.save(book2);
		// session.save(book3);

		session.save(book4);

		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
