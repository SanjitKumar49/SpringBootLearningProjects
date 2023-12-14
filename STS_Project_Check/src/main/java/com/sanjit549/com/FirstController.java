package com.sanjit549.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {
	
    @RequestMapping("/first")
	public String fisrt() {
		return "index";
	}
}
