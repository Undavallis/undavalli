package com.vamsi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {
  
	
	
	public static void main(String[] args) {
		
             ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
             
             FlightBookingSrevice service = (FlightBookingSrevice)context.getBean("flightBookingSrevice");
             
             service.BookFlight("vamsee","United");
	}

}
