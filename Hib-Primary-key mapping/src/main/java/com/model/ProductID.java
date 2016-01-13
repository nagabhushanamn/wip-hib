package com.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

/*
 *  rules for ID class
 *  
 *  1. must be default cons
 *  2. must override 'hashcode and eauals' methods
 *  3. must implement ' Serializable' interface...
 * 
 */

@Embeddable
public class ProductID implements Serializable{

	private int prodNum;
	private String type;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + prodNum;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductID other = (ProductID) obj;
		if (prodNum != other.prodNum)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	public int getProdNum() {
		return prodNum;
	}
	public void setProdNum(int prodNum) {
		this.prodNum = prodNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
