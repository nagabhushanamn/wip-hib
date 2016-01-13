package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int id;
	
	@ManyToMany
	private List<Employee> employees;
	
}
