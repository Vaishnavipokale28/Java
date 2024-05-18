package com.model;
import java.lang.Comparable;
public class Student implements Comparable<Student>{
	private int sid;
	private String sname;
	private String scity;
	private double spercentage;
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
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage + "]";
	}
	public Student(int sid, String sname, String scity, double spercentage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.scity = scity;
		this.spercentage = spercentage;
	}
	
	public int compareTo(Student o) {
		if(sid>o.sid)
			return 1;
		else if(sid<o.sid)
			return -1;
		return 0;
	}
	
	
}
