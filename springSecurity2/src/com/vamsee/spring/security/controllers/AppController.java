package com.vamsee.spring.security.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vamsee.spring.security.service.SecurityService;

@Controller
public class AppController {
	
	@Autowired
	private SecurityService securityService;
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getHomePage(){
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/dashboard",method=RequestMethod.GET)
	public ModelAndView getDashboardPage(Principal principal){
		//System.out.println("LoggedinUser for /dashboard     "+principal.getName());
		return new ModelAndView("dashboard");
	}
	
	@Secured(value = { "ROLE_ADMIN" })
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public ModelAndView getAdminPage(Principal principal){
		//System.out.println("LoggedinUser for /admin     "+principal.getName());
		return new ModelAndView("admin");
	}
	
	@RequestMapping(value="/reports",method=RequestMethod.GET)
	public ModelAndView getReportsPage(Principal principal){
		//System.out.println("LoggedinUser for /reports     "+principal.getName());
		return new ModelAndView("reports");
	}

	@RequestMapping(value="/denied",method=RequestMethod.GET)
	public ModelAndView getAccessDeniedPage(Principal principal){
		//System.out.println("LoggedinUser for /reports     "+principal.getName());
		return new ModelAndView("denied");
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView getRegisterPage(){
		//System.out.println("LoggedinUser for /reports     "+principal.getName());
		return new ModelAndView("register");
	}
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView getPOSTRegisterPage(@RequestParam("email") String email,@RequestParam("password") String password ){
		//System.out.println("LoggedinUser for /reports     "+principal.getName());
		//System.out.println("email >>> " + email+"   password  >>>  "+password);
		securityService.createUserAccount(email, password);
		return new ModelAndView("home");
	}
	
	
}
