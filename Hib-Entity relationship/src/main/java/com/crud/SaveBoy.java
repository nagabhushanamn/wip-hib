package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Boy;
import com.model.Girl;


public class SaveBoy {

	public static void main(String[] args) {

		Boy boy=new Boy();
		boy.setId(33);
		boy.setName("New Nag");
		
		Girl girl=new Girl();
		girl.setId(44);
		girl.setName("New Indu");

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		// Girl girl=(Girl)session.load(Girl.class, 22);
		// boy.setGirl(girl);
		
		boy.setGirl(girl);
		girl.setBoy(boy);
		
		//session.save(girl);
		session.save(boy);

		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
