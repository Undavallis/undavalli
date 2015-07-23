package com.vamsi.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	@Autowired
private CreditCardService creditService;



public CreditCardService getCreditService() {
	return creditService;
}



public void setCreditService(CreditCardService creditService) {
	this.creditService = creditService;
}



public boolean isPersonAcceptable(String userName){
	return creditService.isCreditCardBalanceAvailable(userName);
}
}
