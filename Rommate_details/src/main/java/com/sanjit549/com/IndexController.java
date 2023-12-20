package com.sanjit549.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("index")
	public String method() {
		System.out.println("work");
		return "index";
	}

}
