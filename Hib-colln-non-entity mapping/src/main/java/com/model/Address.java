package com.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String city;
	private String country;
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
