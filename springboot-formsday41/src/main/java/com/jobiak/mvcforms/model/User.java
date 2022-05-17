package com.jobiak.mvcforms.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//bean ,modael,commandObject,Entity
@Entity
@Table(name="userdata")
public class User {

	

@Id
private Long userId;
private	String name;
private	String email;
private	String mobile;
	User()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String firstName) {
		this.name = firstName;
	}
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
	
}
