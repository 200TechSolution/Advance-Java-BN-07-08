package com.tech.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	
	
	@Id
	private int s_Id;
	
	private String s_Name;
	
	private String address;
	
	private String user_Name;
	
	private String  password;

	public int getS_Id() {
		return s_Id;
	}

	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}

	public String getS_Name() {
		return s_Name;
	}

	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUser_Name() {
		return user_Name;
	}

	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
