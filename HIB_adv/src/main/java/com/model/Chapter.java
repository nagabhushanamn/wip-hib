package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chapter {
	
	@Id
	private int idx;
	private String name;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
