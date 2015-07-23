package com.raj.news.controller;

import java.util.List;

public interface NewsService {
	
	public List<News> getEveryNewsFromMyDB();
   
	public News getNewsByNewsId(Long id);
	
	public void saveMyLatestNews(News news);
	
	public List<News> searchNews(String str);
	
	public List<News> getAllNewsByNewsType(String str);
	
	public List<News> getNewsForCarouselByNewsType(String str);
	
	public List<News> getRecommendedNewByNewsType(String str);
	
	public List<NewsMetric> getNewsMetric();
	public List<News> getRecommendedNewsByNewsType(String str,Long count);
	
	public String getChartData();
}
