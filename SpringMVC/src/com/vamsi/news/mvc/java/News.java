package com.vamsi.news.mvc.java;

import java.io.Serializable;

	public class News implements Serializable{
		private Long id;
		private String headLines;
		private String mainStory;
		
		private String newsType;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getHeadLines() {
			return headLines;
		}

		public void setHeadLines(String headLines) {
			this.headLines = headLines;
		}

		public String getMainStory() {
			return mainStory;
		}

		public void setMainStory(String mainStory) {
			this.mainStory = mainStory;
		}

		public String getNewsType() {
			return newsType;
		}

		public void setNewsType(String newsType) {
			this.newsType = newsType;
		}

		public News(Long id, String headLines, String mainStory, String newsType) {
			super();
			this.id = id;
			this.headLines = headLines;
			this.mainStory = mainStory;
			this.newsType = newsType;
		}
		
		
	}


