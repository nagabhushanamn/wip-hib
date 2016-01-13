package com.model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

/*
 *  Table  : employee
 *  schema : mysql
 * 
 */
@Entity
@Table(name="NEW_EMPLOYEES",schema="mysql")
@SecondaryTable(name="EMP_COMMENTS",schema="mysql",pkJoinColumns={@PrimaryKeyJoinColumn(name="EMP_ID")})
public class Employee {
	
	@Id
	@Column(name="EMP_ID")
	private int id;
	@Column(name="EMP_NAME")
	private String name;
	@Column(table="EMP_COMMENTS")
	private String comment;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
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
