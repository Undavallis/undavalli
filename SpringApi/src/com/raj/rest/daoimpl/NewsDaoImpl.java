package com.raj.rest.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.raj.rest.News.News;
import com.raj.rest.dao.NewsDao;

@Repository
public class NewsDaoImpl implements NewsDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from news",new BeanPropertyRowMapper<News>(News.class));
	}

}
