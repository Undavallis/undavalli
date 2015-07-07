package com.bellinfo.batch2.boox.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bellinfo.batch2.bookx.Service.BookService;
import com.bellinfo.batch2.domain.Book;
import com.bellinfo.batch2.domain.LogIn;


@Controller
public class BookControllers {
	
	
	@Autowired
    private BookService bookService;
		
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView getHomePage(){
		ModelAndView mav=new ModelAndView("home");
		mav.addObject("allbooks",bookService.getAllBooks());
		
		
		return mav;
		
	}
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView getaddpage()
	{
 ModelAndView mav = new ModelAndView("add");
 mav.addObject("book", new Book());
  List<String> bookType= new ArrayList<String>();
 
  bookType.add("DRAMA");
  bookType.add("SPORTS");
  bookType.add("FICTION");
  bookType.add("THRILLER");
  bookType.add("MONEYANDBUSINESS");
  mav.addObject("bookType", bookType);
 
 return mav;

}
	

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ModelAndView getAddPageWithData(@ModelAttribute("book") Book book){
		
		ModelAndView mav=new ModelAndView("home");
		bookService.persistBook(book);
		mav.addObject("allbooks",bookService.getAllBooks());
		return mav;
		
	}
	@RequestMapping(value="/books",method=RequestMethod.GET)
	public ModelAndView getBooksPage(@RequestParam("id") Long id){
		
		ModelAndView mav=new ModelAndView("books");
		Book b=bookService.getBookByBookId(id);		
		mav.addObject("books",b);
		mav.addObject("bookId", bookService.getBookByBookId(id));
		
		mav.addObject("recommendedbooks", bookService.getRecommendedBookByBookName(b.getBookType(), 5L));
		return mav;
		
	}
	
	
	@RequestMapping(value="/Action/{type}",method=RequestMethod.GET)
	public ModelAndView getBookByNavbarClick(@PathVariable("type") String type)
	{
 ModelAndView mav = new ModelAndView("Action");	
	
	mav.addObject("specificbooks", bookService.getBookByBookType(type));
	mav.addObject("casoursel", bookService.getCarouselNewsByNewsType(type));
	System.out.println(bookService.getBookByBookType(type).get(0));
	
return mav;

}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public ModelAndView getSearchResults(@RequestParam("")String str){
		
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("allbooks", bookService.searchBookByBookName(str));
		return mav;
	}
	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView validation(@ModelAttribute("validate")LogIn l1){
		LogIn l=new LogIn();
		System.out.println(l1.getUsername());
		System.out.println(l1.getPassword());
		ModelAndView mav=new ModelAndView();
		if(bookService.validateDetails(l1.getUsername(),l1.getPassword()))
		{
			mav.addObject("allbooks",bookService.getAllBooks());
		mav.setViewName("home");	
		}
		else
		{
			mav.setViewName("signup");	
		}
		System.out.println( bookService.validateDetails(l1.getUsername(),l1.getPassword()));
		//ModelAndView mav=new ModelAndView("home");
		
		//mav.addObject(l);
		return mav;
	}
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getAllDetails(){
		
		LogIn l=new LogIn();
		ModelAndView mav=new ModelAndView();
		mav.addObject("login",l);
		mav.setViewName("login");
		return mav;
		
		
	}
	@RequestMapping(value="/signup",method=RequestMethod.GET)
	public ModelAndView getSignUpPage()
	{
		
 ModelAndView mav = new ModelAndView("signup");
 mav.addObject("LogIn", new LogIn());
 return mav;
	}
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public ModelAndView getSignUpPageWithData(@ModelAttribute("signup")LogIn l){
		
		ModelAndView mav=new ModelAndView("login");
		bookService.saveLatestDetails(l);
		mav.addObject("signup", bookService.getAllDetails());
		return mav;
		
	}
	
}