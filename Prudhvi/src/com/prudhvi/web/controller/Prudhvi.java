package com.prudhvi.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prudhvi.web.beans.Student;

@Controller
public class Prudhvi {
	
	@RequestMapping(value="/")
	public ModelAndView getWelcomePage()
	{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/form",method=RequestMethod.GET)
	public ModelAndView getForm()
	{
		Student student=new Student();
		student.setId(System.currentTimeMillis());
		System.out.println(student.getId());
		ModelAndView mav= new ModelAndView("form").addObject("student", student);
		return mav;
	}
    
	@RequestMapping(value="/form",method=RequestMethod.POST)
	public ModelAndView getSubmittedPage(@ModelAttribute("student")Student student)
	{
		System.out.println(student);
		return new ModelAndView("submittedform").addObject("student", student);
	}
}
