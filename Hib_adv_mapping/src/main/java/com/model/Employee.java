package com.model;

import java.util.Date;

import javax.persistence.Column;
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
	@Temporal(TemporalType.DATE)
	private Date dob;
	// @Enumerated(EnumType.ORDINAL)
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Lob
	private String empDesc;
	@Lob
	private byte[] empPic;
	@Transient
	private String nonTableFild;
	
	

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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
