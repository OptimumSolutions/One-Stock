package com.onedream.onestock.database;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "developer")
public class Developer {
	
	@Basic
	@Column(name = "name")
	private String name;
	
	@Basic
	@Column(name = "insterest")
	private String interest;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	

}
