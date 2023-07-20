package com.tech.statement;

public class Student implements Comparable {
	
	int sid;
	String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + "]";
	}
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	
	
	

}
