package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Temporal;

/*
 *  Table  : employee
 *  schema : mysql
 * 
 */
@Entity
@Table(name = "WIP_EMPLOYEES", schema = "mysql")
public class Employee {

	@Id
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "EMP_NAME")
	private String name;
	
	@ElementCollection
	@CollectionTable(name="WIP_EMPLOYEE_ADDRESSES",joinColumns={@JoinColumn(name="EMP_ID")})
	private List<Address> addresses=new ArrayList<>();
	
	

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
