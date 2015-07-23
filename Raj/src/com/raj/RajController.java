package com.raj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RajController {

	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getWelcomePage() {
		
				
		return new ModelAndView("home");
		
	}
	
	@RequestMapping(value="/cardetails",method=RequestMethod.GET)
	public ModelAndView carPage(){
		
		Car car= new Car();
		
		
		return new ModelAndView("cardetails").addObject("car", car);
		
	}
	@RequestMapping(value="/cardetails",method=RequestMethod.POST)
	public ModelAndView carDetailsPage(@ModelAttribute("car") Car car){
		
	    System.out.println(car);
		return new ModelAndView("cardetailsPage").addObject("car", car);
	}
	@RequestMapping(value="/newcar",method=RequestMethod.POST)
	public ModelAndView newCar(@RequestParam("carname")String carName)
	{
		System.out.println(carName);
		return new ModelAndView("cardetailsPage").addObject("carName", carName);
	}

}
