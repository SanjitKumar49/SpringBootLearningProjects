package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	private int custid;
	private String customer;
	private String coursename;
	@Autowired
	private Techonolgy techonolgy;
	
	
	public Techonolgy getTechonolgy() {
		return techonolgy;
	}
	public void setTechonolgy(Techonolgy techonolgy) {
		this.techonolgy = techonolgy;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public void display() {
		System.out.println("object Return successfully");
		techonolgy.display();
	}
	
}
