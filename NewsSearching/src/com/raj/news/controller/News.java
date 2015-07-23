package com.raj.news.controller;

import java.io.Serializable;

public class News implements Serializable {
	

	private long id;
	private String headlines;
	private String mainStory;
	private String videoUrl;
	private String imageUrl;
	
	private String newsType;

	
	
	@Override
	public String toString() {
		return "News [id=" + id + ", headlines=" + headlines + ", mainStory="
				+ mainStory + ", videoUrl=" + videoUrl + ", imageUrl="
				+ imageUrl + ", newsType=" + newsType + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHeadlines() {
		return headlines;
	}

	public void setHeadlines(String headlines) {
		this.headlines = headlines;
	}

	public String getMainStory() {
		return mainStory;
	}

	public void setMainStory(String mainStory) {
		this.mainStory = mainStory;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getNewsType() {
		return newsType;
	}

	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}
	
	

}
