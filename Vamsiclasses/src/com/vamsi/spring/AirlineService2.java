package com.vamsi.spring;

import org.springframework.stereotype.Service;

@Service
public class AirlineService2 implements AirlineService{

	@Override
	public String getAvailableFlight(String flightId) {
		// TODO Auto-generated method stub
		return "Emirates-67";
	}

}
