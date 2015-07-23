package com.raj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cam.raj.dao.FlickrDao;

@org.springframework.stereotype.Service
public class FlickrService implements Service{
    
	@Autowired
	public FlickrDao flickrDao;
	@Override
	public List<String> getAllImages() {
		// TODO Auto-generated method stub
		return flickrDao.getAllImages();
	}

}
