package com.raj.rest.NewsServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raj.rest.News.News;
import com.raj.rest.dao.NewsDao;
import com.raj.rest.service.NewsService;


@Service
public class NewsServiceImpl implements NewsService{
	
	
	@Autowired
	private NewsDao newsDao;

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return newsDao.getAllNews();
	}

	

}
