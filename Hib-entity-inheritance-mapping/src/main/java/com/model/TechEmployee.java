package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("TE")
public class TechEmployee extends Employee {

	private String techSkill;

	public String getTechSkill() {
		return techSkill;
	}

	public void setTechSkill(String techSkill) {
		this.techSkill = techSkill;
	}
	
	
}
