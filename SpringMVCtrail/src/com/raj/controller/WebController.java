package com.raj.controller;
import java.util.ArrayList;
import java.util.List;




import com.raj.news.News;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView myFirstMVCPage(){ 
		ModelAndView mav = new ModelAndView();
		mav.setViewName("One");
		return mav;
		
	}
	
 @RequestMapping(value="/second",method=RequestMethod.GET)
 public ModelAndView mySecondMVCPage(){
	 ModelAndView mav = new ModelAndView();
	 mav.setViewName("Two");
	 mav.addObject("message", "this is my second page");
	 String message="prudhvi";
	 return mav;
	 
}
 
 @RequestMapping(value="/three",method = RequestMethod.GET)
 public ModelAndView myThirdMVCPage(){
	 ModelAndView mav = new ModelAndView();
	 mav.setViewName("Three");
	 News n = new News(System.currentTimeMillis(),"Apple is great","I have no idea","Technology");
	 mav.addObject("mynews", n);
	 return mav;
 }
 
 @RequestMapping(value="/four", method = RequestMethod.GET)
 public ModelAndView myFourController()
 {
	 ModelAndView mav = new ModelAndView();
	 mav.setViewName("Four");
	 	News n1 = new News(System.currentTimeMillis(),"prudhvi","raj","undavalli");
		News n2 = new News(System.currentTimeMillis(),"undavalli","prudhvi","raj");
		News n3 = new News(System.currentTimeMillis(),"Apple is great","I have no idea","Technology");
		News n4 = new News(System.currentTimeMillis(),"iphone","6plus","bigscreen");

List<News> al = new ArrayList<News>();
al.add(n1);
al.add(n2);
al.add(n3);
al.add(n4);

		
		mav.addObject("mynews", al);
		return mav;
	}
@RequestMapping(value = "/form",method = RequestMethod.GET)
 
 public ModelAndView getForm()
 {
	 ModelAndView mav = new ModelAndView();
	 mav.setViewName("form");
	 News n = new News();//we are sending an empty object
	 mav.addObject("mynews",n);
	 return mav;
 }
@RequestMapping(value = "/edit",method = RequestMethod.GET)

public ModelAndView getFormEdited(@RequestParam("id") Long id)
{    //i am going to fetch data with id 100 and pass it to jsp engine to render input fields
	 ModelAndView mav = new ModelAndView();
		 System.out.println("fetching the news with ID>>>>" +id);
	 
	 mav.setViewName("form");
	 News n = new News(id,"fetched news object from id"," this is my main story","spring");
	 mav.addObject("mynews",n);
	 return mav;
}

 @RequestMapping(value = "/submittedForm",method = RequestMethod.POST)
 
 public ModelAndView getFormWithData(@ModelAttribute("mynews")News mynews)
 {    System.out.println(mynews);
 //calling a service and doing some thing we like 
	 ModelAndView mav = new ModelAndView();
	 mav.setViewName("submittedForm");
	
	 mav.addObject("mynews",mynews);
	 return mav;
 }

 @RequestMapping(value = "/five",method = RequestMethod.GET)
	public ModelAndView myFiveController(@RequestParam("q") Long q,@RequestParam("y") String y){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Five");
		News n = new News(q,"Apple is great","I have no idea",y);   // this is how we access five?q=123123123&y=technology
		mav.addObject("mynews", n);
		return mav;
	}
	
	
	@RequestMapping(value = "/six/{id}/{newsType}",method = RequestMethod.GET)
	public ModelAndView mySixController(@PathVariable("id") Long id,@PathVariable("newsType") String newsType){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Six");
		News n = new News(id,"Apple is great","I have no idea",newsType);
		mav.addObject("mynews", n);
		return mav;                                 //  six/123456/technology
	}
		
	}



