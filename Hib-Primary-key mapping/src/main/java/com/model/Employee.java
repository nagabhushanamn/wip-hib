package com.model;

import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/*
 *  Table  : employee
 *  schema : mysql
 * 
 */
@Entity
@Table(name = "NEW_EMPLOYEES", schema = "mysql")
public class Employee {

	@Id
	// @SequenceGenerator(name="seqGen",sequenceName="EMP_SEQ")
	// @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seqGen")
//	@TableGenerator(name="tableGen",
//	                table="MY_PK",
//	                pkColumnName="ENTITY",
//	                pkColumnValue="Employee",
//	                valueColumnName="NEXT_VALUE",
//	                initialValue=1,
//	                allocationSize=1)
//	@GeneratedValue(strategy=GenerationType.TABLE,generator="tableGen")
	@GenericGenerator(name="myPk",strategy="com.pk.PKAlgm")
	@GeneratedValue(generator="myPk")
	@Column(name = "EMP_ID")
	private int id;
	@Column(name = "EMP_NAME")
	private String name;

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
