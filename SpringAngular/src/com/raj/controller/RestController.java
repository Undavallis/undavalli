package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RestController {

	@ResponseBody
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getMyHomepage()
	{
		
		return new ModelAndView("/home");
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getHomePage()
	{
		return new ModelAndView("/home");
	}
	
}
