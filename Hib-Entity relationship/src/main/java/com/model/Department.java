package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	private int id;
	private String name;

	@OneToMany(mappedBy="department",targetEntity=Employee.class)
	private List<Employee> employees;
	
}
