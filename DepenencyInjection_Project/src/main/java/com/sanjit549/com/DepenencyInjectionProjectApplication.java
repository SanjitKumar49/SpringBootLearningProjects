package com.sanjit549.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DepenencyInjectionProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(DepenencyInjectionProjectApplication.class, args);
	      Sanjit obj= ctx.getBean(Sanjit.class);
	      obj.method1();
	      
	   Avit onj2=ctx.getBean(Avit.class);
	   onj2.method2();
	      
	      
	}

}
