package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Employee;
import com.model.Gender;

public class SelectEmployee_Ex {

	public static void main(String[] args) {

		
		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		Employee emp=(Employee)session.get(Employee.class, 123);
		System.out.println(emp);
		System.out.println(emp.getAddresses().size());
		
		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
