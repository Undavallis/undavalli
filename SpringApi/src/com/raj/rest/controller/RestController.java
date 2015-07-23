package com.raj.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.raj.rest.News.News;
import com.raj.rest.service.NewsService;

@Controller
public class RestController {
	@Autowired
	private NewsService newsService;
	
	@ResponseBody
	@RequestMapping(value = "/news",method=RequestMethod.GET)
	public List<News> getAllNews(){
    	
    	return newsService.getAllNews();
		
	}
	
}
