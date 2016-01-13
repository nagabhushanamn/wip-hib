package com.model;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 *  Table  : employee
 *  schema : mysql
 * 
 */
@Entity
@Table(name = "NEW_NEW_EMPLOYEES", schema = "mysql")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "E_TYPE")

//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorValue("E")
public class Employee {

	@Id
	private int id;
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
