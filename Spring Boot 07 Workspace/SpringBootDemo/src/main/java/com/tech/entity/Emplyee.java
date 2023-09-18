package com.tech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Emplyee {
	
	
   @Id
	private int e_Id;
	
	private String firsName;
	
	private double salary;
	
	private String address;
	
	private String lastName;
	
	
	


	
	




	@Override
	public String toString() {
		return   "e_Id=" + e_Id + ", firsName=" + firsName + ", salary=" + salary + ", address=" + address
				+ ", lastName=" + lastName;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getE_Id() {
		return e_Id;
	}

	public void setE_Id(int e_Id) {
		this.e_Id = e_Id;
	}

	

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
