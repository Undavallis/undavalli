package com.bellinfo.batch2.bookx.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bellinfo.batch2.bookx.Dao.BookDao;
import com.bellinfo.batch2.bookx.Service.BookService;
import com.bellinfo.batch2.domain.Book;
import com.bellinfo.batch2.domain.LogIn;
@Service
public class BookServiceImpl implements BookService{
@Autowired
private BookDao bookDao;
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookDao.getAllBooks();
	}
	@Override
	public void persistBook(Book book) {
		// TODO Auto-generated method stub
		bookDao.saveLatestBook(book);
	}
	@Override
	public Book getBookByBookId(Long id) {
		// TODO Auto-generated method stub
		return bookDao.getBookByBookId(id);
	}
	@Override
	public List<Book> getCarouselNewsByNewsType(String str) {
		// TODO Auto-generated method stub
		return bookDao.getCarouselNewsByNewsType(str);
	}
	@Override
	public List<Book> getBookByBookType(String bookType) {
		// TODO Auto-generated method stub
		return bookDao.getBookByBookType(bookType);
	}
	@Override
	public List<Book> getRecommendedBookByBookName(String str, Long count) {
		// TODO Auto-generated method stub
		return bookDao.getRecommendedBookByBookName(str, count);
	}
	@Override
	public List<Book> searchBookByBookName(String str) {
		// TODO Auto-generated method stub
		return bookDao.searchBookByBookName(str);
	}
	@Override
	public boolean validateDetails(String str,String str1) {
		// TODO Auto-generated method stub
		return bookDao.validateDetails(str, str1);
	}
		@Override
	public List<LogIn> getAllDetails() {
		// TODO Auto-generated method stub
		return bookDao.getAllDetails();
	}
		@Override
		public void saveLatestDetails(LogIn login) {
			// TODO Auto-generated method stub
			bookDao.saveLatestDetails(login);
		}
	
}
