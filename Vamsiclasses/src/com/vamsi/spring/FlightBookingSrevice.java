package com.vamsi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightBookingSrevice {
    @Autowired
	private PersonService pService;
	@Autowired
	private AirlineService aService;
	
	
	
	public PersonService getpService() {
		return pService;
	}

	public void setpService(PersonService pService) {
		this.pService = pService;
	}
	public AirlineService getaService() {
		return aService;
	}


	public void setaService(AirlineService aService) {
		this.aService = aService;
	}






	public String BookFlight(String userName , String flightId)
	{
	// Check User CreditCard Balance	
		if(pService.isPersonAcceptable(userName)){
			String flight=aService.getAvailableFlight(flightId);
			System.out.println(" now booking flight for user"+ userName +" with flight "+flight);
		return "success";}
		return "fail";
	}
}
