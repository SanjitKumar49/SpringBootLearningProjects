package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.core.Application;

@ComponentScan
@SpringBootApplication
public class FormProjectApplication  extends SpringBootServletInitializer{
	
         @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
            return applicationBuilder.sources(FormProjectApplication.class);	
        
        }
	public static void main(String[] args) {
		SpringApplication.run(FormProjectApplication.class, args);
	}

}
