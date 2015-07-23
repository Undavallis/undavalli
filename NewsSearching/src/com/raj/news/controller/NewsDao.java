package com.raj.news.controller;

import java.util.List;


public interface NewsDao {
	
    public List<News> getAllNews();
       
    public void persistNews(News news);
    public News getNewsById(Long newsId);
    public List<News> searchNewsByQuery(String Query);
    public List<News> getNewsByType(String newsType);
	public List<News> getNewsForCarouselByNewsType(String str);
	public List<News> getRecommendedNewByNewsType(String str);
	public List<NewsMetric> getNewsMetric();
	
	public List<News> getRecommendedNewsByNewsType(String str,Long count);

}
