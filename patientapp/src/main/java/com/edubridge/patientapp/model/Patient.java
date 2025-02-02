
package com.edubridge.patientapp.model;

public class Patient { 

/*
Model
Entity
DTO-Data Transfer Object
POJO - Plain Old Java Object
*/

	private int id;
	private String name;
	private String email;
	private Long mobile;
	
	//generate getter and setter methods
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}	
}




