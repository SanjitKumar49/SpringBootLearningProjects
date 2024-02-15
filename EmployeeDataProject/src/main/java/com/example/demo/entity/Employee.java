package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Data")  
public class Employee {
	@Id
	@GeneratedValue
	private Integer  empid;
	@Column(name = "EmployeeName")
	private String empName;
	@Column(name = "EmployeeMobNumber")
	private String empNumber;
	@Column(name = "EmployeeEmailId")
	private String empEmail;
	@Column(name = "EmployeeProfileImage")
	private String empProfileImg;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpProfileImg() {
		return empProfileImg;
	}
	public void setEmpProfileImg(String empProfileImg) {
		this.empProfileImg = empProfileImg;
	}
	public Employee(Integer empid, String empName, String empNumber, String empEmail, String empProfileImg) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empNumber = empNumber;
		this.empEmail = empEmail;
		this.empProfileImg = empProfileImg;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empNumber=" + empNumber + ", empEmail="
				+ empEmail + ", empProfileImg=" + empProfileImg + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	




}
