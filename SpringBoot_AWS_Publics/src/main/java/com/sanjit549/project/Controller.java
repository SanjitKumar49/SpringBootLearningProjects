package com.sanjit549.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   @RequestMapping("/")
   public String getSomeInfo() {
	   return "Welcome to Smart Developer Organistion";
   }
}
