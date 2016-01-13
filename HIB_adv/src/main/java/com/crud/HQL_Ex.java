package com.crud;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Book;
import com.model.Chapter;
import com.model.Publisher;

public class HQL_Ex {

	public static void main(String[] args) {

		// We need Hibernate API
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// ----------------------------------------------
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();

		// String hql="from Book book where book.name like '%Boo%' and
		// book.price between 1000 and 2000";
		// String hql="from Book book where book.publisher.name like '%Abc%'";
		// String hql="from Book book where book.publisher is not null";
		// String hql="from Book book where book.chapters.size > 0";
		// String hql="from Book book where book.chapters is empty";
		// String hql="from Book book where book.publisher.name in('Abc Pvt
		// Ltd','Xyz Pvt Ltd')";

		// String price="1000";
		// String hql = "from Book book where book.price=?";
		// String hql = "from Book book where book.price=:bprice";
		// Query query = session.createQuery(hql);

		// // Pagination
		// query.setFirstResult(2);
		// query.setMaxResults(2);

		// query.setParameter(0, 1000.00);
		// query.setParameter("bprice", 1000.00);

		// Query query=session.getNamedQuery("Book.findAll");

		// List<Book> books = query.list();
		//
		// for (Book book : books) {
		// System.out.println(book);
		// }

		// --------------------------------------------------

		// String hql="select book.name,book.price from Book book";
		// Query query=session.createQuery(hql);

		// List<String> bookNames=query.list();
		// for(String bookName:bookNames){
		// System.out.println(bookName);
		// }

		// List<Object[]> list=query.list();
		// for(Object[] oa:list){
		// System.out.println(oa[0]+" "+oa[1]);
		// }

		// -----------------------------------------------------

		// String hql="select new
		// com.crud.BookSummary(book.name,book.price,book.publisher.name) from
		// Book book";
		// Query query=session.createQuery(hql);
		// List<BookSummary> list=query.list();
		// for(BookSummary bs:list){
		// System.out.println(bs);
		// }

		// String hql1="select new
		// list(book.name,book.price,book.publisher.name) from Book book";
		// String hql2="select new map(book.name,book.price,book.publisher.name)
		// from Book book";

		// Query query=session.createQuery(hql2);
		// List<Map<String, Object>> list=query.list();
		// System.out.println(list.size());

		// ----------------------------------------------

		// Joins

		// a. Inner Join
		// b. Outer Join

		// Left
		// Inner

		String hql = "from Book book left outer join book.publisher pub where pub.name='Xyz Pvt Ltd'";
		Query query = session.createQuery(hql);

		List<Object[]> list = query.list();
		System.out.println(list.size());

		session.getTransaction().commit();
		session.close();
		// -------------------------------------------
		sessionFactory.close();
	}

}
