package com.sanjit549.com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Student {
	
	@Id
	 private int studentRegNo;
	 private String studentName;
	 private String studentDept;
	 private String studentYear;
	 private String studentHome;
	public int getStudentRegNo() {
		return studentRegNo;
	}
	public void setStudentRegNo(int studentRegNo) {
		this.studentRegNo = studentRegNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	public String getStudentYear() {
		return studentYear;
	}
	public void setStudentYear(String studentYear) {
		this.studentYear = studentYear;
	}
	public String getStudentHome() {
		return studentHome;
	}
	public void setStudentHome(String studentHome) {
		this.studentHome = studentHome;
	}
	@Override
	public String toString() {
		return "Student [studentRegNo=" + studentRegNo + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ ", studentYear=" + studentYear + ", studentHome=" + studentHome + "]";
	}
	 
	
}
