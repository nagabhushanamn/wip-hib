package com.crud;

// ResultSet mappin class

public class BookSummary {
	
	@Override
	public String toString() {
		return "BookSummary [name=" + name + ", price=" + price + ", pubName=" + pubName + "]";
	}
	private String name;
	private double price;
	private String pubName;
	public BookSummary(String name, double price, String pubName) {
		super();
		this.name = name;
		this.price = price;
		this.pubName = pubName;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getPubName() {
		return pubName;
	}
	
	

}
