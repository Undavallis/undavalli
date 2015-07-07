package com.bellinfo.batch2.bookx.Dao.impl;

import java.util.Iterator;
import java.util.List;










import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bellinfo.batch2.bookx.Dao.BookDao;
import com.bellinfo.batch2.domain.Book;
import com.bellinfo.batch2.domain.LogIn;







@Repository
public class BookDaoImpl implements BookDao {
	@Autowired
private JdbcTemplate jdbcTemplate;


@Override
public List<Book> getAllBooks() {
	// TODO Auto-generated method stub
	return jdbcTemplate.query("select * from book order by Random() limit 10",new BeanPropertyRowMapper<Book>(Book.class));
}

@Override
public void saveLatestBook(Book book) {
	// TODO Auto-generated method stub
	String insertSQL="INSERT INTO book(\"bookId\",\"bookName\",\"imageUrl\",\"bookType\",\"bookDescription\") VALUES(?,?,?,?,?)";
	jdbcTemplate.update(insertSQL,new Object[]{book.getBookId(),book.getBookName(),book.getImageUrl(),book.getBookType(),book.getBookDescription()});
}


public Book getBookByBookId(Long id) {
	// TODO Auto-generated method stub
	String str ="select * from book where \"bookId\"="+id;
	return  jdbcTemplate.queryForObject(str, new BeanPropertyRowMapper<Book>(Book.class));
}

@Override
public List<Book> getCarouselNewsByNewsType(String str) {
	// TODO Auto-generated method stub
	String query = "";
	if(StringUtils.isEmpty(str)){
		query = "select * from book order by Random() limit 4";
		
	}else{
		
		query = "select * from book where \"bookType\" = '"+str+"'order by Random() limit 5";
	}
	return jdbcTemplate.query(query, new BeanPropertyRowMapper<Book>(Book.class));
}

@Override
public List<Book> getBookByBookType(String bookType) {
	// TODO Auto-generated method stub
String q = "select  * from book where  \"bookType\" = upper(?) ";
	
	return jdbcTemplate.query(q, new Object[]{bookType},new BeanPropertyRowMapper<Book>(Book.class));		
	 
	
}

@Override
public List<Book> getRecommendedBookByBookName(String str, Long count) {
	// TODO Auto-generated method stub
	String query = "select * from book where \"bookType\" = '"+ str+"'order by Random() limit 10";
	return jdbcTemplate.query(query, new BeanPropertyRowMapper<Book>(Book.class));
}

@Override
public List<Book> searchBookByBookName(String str) {
	// TODO Auto-generated method stub
	String s = "select  * from book where upper(\"bookName\") Like upper('%"+str+"%')";
	//System.out.println(q);
	return jdbcTemplate.query(s,new BeanPropertyRowMapper<Book>(Book.class));		
	
}
@Override
public List<LogIn> getAllDetails() {
	// TODO Auto-generated method stub
	return jdbcTemplate.query("select * from alogin", new BeanPropertyRowMapper<LogIn>(LogIn.class));
}

@Override
public boolean validateDetails(String str, String str1) {
	
	// TODO Auto-generated method stub
	int count=1;
	List<LogIn> list=getAllDetails();
	Iterator<LogIn> itr=list.iterator();
	while(itr.hasNext()){
		
		LogIn l=itr.next();
		System.out.println(str);
		System.out.println(str1);
		if(l.getUsername().equals(str)&l.getPassword().equals(str1)){
			
			count++;
		}
	}
	if(count==2){
		return true;
	}
return false;
}

@Override
public void saveLatestDetails(LogIn login) {
	// TODO Auto-generated method stub
	String insertSQL="INSERT INTO alogin(fullname,username,password) VALUES(?,?,?)";
	jdbcTemplate.update(insertSQL,new Object[]{login.getFullname(),login.getUsername(),login.getPassword()});
	
}









	
}





	

	
	
	
	

