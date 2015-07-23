package com.raj.news.controller;

import java.io.Serializable;

public class NewsMetric implements Serializable{
	
	//private static final Long serialVersionUID = 345345345345345;
   private String  newsType;
   private Long count;
public String getNewsType() {
	return newsType;
}
public void setNewsType(String newsType) {
	this.newsType = newsType;
}
public Long getCount() {
	return count;
}
public void setCount(Long count) {
	this.count = count;
}
   
}
