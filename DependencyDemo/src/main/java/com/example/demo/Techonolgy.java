package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Techonolgy {

	private int techid;
	private String name;
	public int getTechid() {
		return techid;
	}
	public void setTechid(int techid) {
		this.techid = techid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Completed");
	}
}
