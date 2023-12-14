package com.sanjit549.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sanjit {
	
	private int id;
	private String add;
	
	@Autowired
	Avit avit;
	
	public Sanjit() {
		System.out.println("Object create : Sanjit.class");
	}
	
	public void method1() {
		System.out.println("Simply method of Sanjit class");
		//avit.method2();

	}
	

	

}
