package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
import com.model.NonTechEmployee;
import com.model.TechEmployee;

public class InsertEmployee_Ex {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("A");

		TechEmployee techEmployee=new TechEmployee();
		techEmployee.setId(2);
		techEmployee.setName("B");
		techEmployee.setTechSkill("Java");
		
		NonTechEmployee nonTechEmployee=new NonTechEmployee();
		nonTechEmployee.setId(3);
		nonTechEmployee.setName("C");
		nonTechEmployee.setDivision("HR");
		
		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		session.save(employee);
		session.save(techEmployee);
		session.save(nonTechEmployee);

		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
