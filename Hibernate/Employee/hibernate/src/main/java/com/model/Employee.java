package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp1")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "e_id", columnDefinition = "int(5)")
	private int eid;
	@Column(name = "e_name",columnDefinition = "varchar(100)",nullable = false)
	private String ename;
	@Column(name = "e_designation",columnDefinition = "varchar(100)",nullable = false)
	private String edesignation;
	@Column(name = "e_company",columnDefinition = "varchar(100)",nullable = false)
	private String ecompany;
	@Column(name = "e_salary",columnDefinition = "double(10,2)")
	private double esalary;
	public int getEid() {
		return eid;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edesignation=" + edesignation + ", ecompany=" + ecompany
				+ ", esalary=" + esalary + "]";
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	public String getEcompany() {
		return ecompany;
	}
	public void setEcompany(String ecompany) {
		this.ecompany = ecompany;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	

}
