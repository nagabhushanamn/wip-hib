package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "dep_id")
	private Department department;

	@ManyToMany
	private List<Project> projects;

}
