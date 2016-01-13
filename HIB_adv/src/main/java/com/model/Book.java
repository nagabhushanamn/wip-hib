package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@NamedQueries({
	//@NamedQuery(name="Book.findAll",query="SELECT * from Book book")
})
@Cacheable(value=true)
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Book {
	
	@Id
	private int isbn;
	private String name;
	private double price;
	
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", publisher=" + publisher + "]";
	}

	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Chapter> chapters=new ArrayList<>();
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Publisher publisher;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	

}
