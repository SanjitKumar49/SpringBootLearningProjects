package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CourseControoler {

	@RequestMapping("course")
	// @ResponseBody --> using thia Annotation data will show  
	public ModelAndView courses(@RequestParam ("cname") String courname,HttpSession session) {
		
   ModelAndView  mv=new ModelAndView();
   mv.addObject("cname",courname);
   mv.setViewName("course");
   return mv;
		
	}
}
