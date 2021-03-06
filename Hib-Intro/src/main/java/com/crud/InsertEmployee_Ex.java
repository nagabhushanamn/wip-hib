package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class InsertEmployee_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Nag");
		employee.setComment("he is bad trainer");

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(employee);

		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
