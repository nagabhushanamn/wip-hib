package com.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
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

	@Embedded
	private Address address;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="city",column=@Column(name="home_city")),
		@AttributeOverride(name="country",column=@Column(name="home_country"))
	})
	private Address homeAddress;

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
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
