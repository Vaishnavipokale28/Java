package com.model;

import java.util.Arrays;

import com.demo.Address;

public class Student {
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;
	private int[] marks;
	private Address address;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage
				+ ", marks=" + Arrays.toString(marks) + ", address=" + address + "]";
	}
	
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

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public double getSpercentage() {
		return spercentage;
	}

	public void setSpercentage(double spercentage) {
		this.spercentage = spercentage;
	}

	public Student(int sid, String sname, String scity, double spercentage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.spercentage = spercentage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
