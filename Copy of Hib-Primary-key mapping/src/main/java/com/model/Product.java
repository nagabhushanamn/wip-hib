package com.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@EmbeddedId  // composite PK mapping...
	private ProductID id;
	private String name;
	public ProductID getId() {
		return id;
	}
	public void setId(ProductID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
