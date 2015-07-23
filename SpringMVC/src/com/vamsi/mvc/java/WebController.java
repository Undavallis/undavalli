package com.vamsi.mvc.java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vamsi.news.mvc.java.News;


	public class WebController {
		@RequestMapping(value = "/",method = RequestMethod.GET)
	public ModelAndView myFirstMVCPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/one.jsp");
		return mav;
	}
		@RequestMapping(value = "/second",method = RequestMethod.GET)
	public ModelAndView mySecondMVCPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/pages/two.jsp");
		mav.addObject("message","This is spring MVC");
		String message = "prudhvi";
		return mav;
			
			
		
	}
		@RequestMapping(value = "/three",method = RequestMethod.GET)
		public ModelAndView myThirdController(){
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/WEB-INF/pages/three.jsp");
			News n = new News(System.currentTimeMillis(),"Apple is great","I have no idea","Technology");
			mav.addObject("mynews", n);
			return mav;
		}
		
		
		@RequestMapping(value = "/four",method = RequestMethod.GET)
		public ModelAndView myFourController(){
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/WEB-INF/pages/four.jsp");
			News n1 = new News(System.currentTimeMillis(),"Apple is great","I have no idea","Technology");
			News n2 = new News(System.currentTimeMillis(),"Apple is great","I have no idea","Technology");
			News n3 = new News(System.currentTimeMillis(),"Apple is great","I have no idea","Technology");
			News n4 = new News(System.currentTimeMillis(),"Apple is great","I have no idea","Technology");

	List<News> al = new ArrayList<News>();
	al.add(n1);
	al.add(n2);
	al.add(n3);
	al.add(n4);

			
			mav.addObject("mynews", al);
			return mav;
		}

		
		@RequestMapping(value = "/five",method = RequestMethod.GET)
		public ModelAndView myFiveController(@RequestParam("q") Long q,@RequestParam("y") String y){
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/WEB-INF/pages/five.jsp");
			News n = new News(q,"Apple is great","I have no idea",y);   // this is how we access five?q=123123123&y=technology
			mav.addObject("mynews", n);
			return mav;
		}
		
		
		@RequestMapping(value = "/six/{id}/{newsType}",method = RequestMethod.GET)
		public ModelAndView mySixController(@PathVariable("id") Long id,@PathVariable("newsType") String newsType){
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/WEB-INF/pages/six.jsp");
			News n = new News(id,"Apple is great","I have no idea",newsType);
			mav.addObject("mynews", n);
			return mav;                                 //  six/123456/technology
		}
	}


