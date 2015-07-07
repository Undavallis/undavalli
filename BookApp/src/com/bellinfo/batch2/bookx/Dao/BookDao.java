package com.bellinfo.batch2.bookx.Dao;

import java.util.List;

import com.bellinfo.batch2.domain.Book;
import com.bellinfo.batch2.domain.LogIn;

public interface BookDao {
	public List<Book> getAllBooks();
	public void saveLatestBook(Book book);
	
	public Book getBookByBookId(Long id);
	public List<Book> getCarouselNewsByNewsType(String str);
public List<Book> getBookByBookType(String bookType);
	public List<Book> getRecommendedBookByBookName(String str,Long count);
	public List<Book> searchBookByBookName(String str);
	public boolean validateDetails(String str,String str1);
public void saveLatestDetails(LogIn login);
public List<LogIn> getAllDetails();
}
