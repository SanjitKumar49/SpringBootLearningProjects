package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	
	@GetMapping("sanjit")
	public String sanjit() {
		
		return "sanjit";
	}
	
	@PostMapping("details")
	 String viewdetails(@RequestParam("cid") String cid, @RequestParam("cname") String cname , @RequestParam("cemail") String cemail, ModelMap modelMap) 
	{
	    	modelMap.put("cid", cid); 
	    	modelMap.put("cname", cname); 
	    	modelMap.put("cemail", cemail); 
			return "viewCustomer";
	}

}
