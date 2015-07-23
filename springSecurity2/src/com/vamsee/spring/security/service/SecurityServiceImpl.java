package com.vamsee.spring.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamsee.spring.security.doa.SecurityDAO;
import com.vamsee.spring.security.utils.SecurityUtils;

@Service
public class SecurityServiceImpl implements SecurityService {
	
	@Autowired
	private SecurityDAO securityDAO;

	@Override
	public void createUserAccount(String email, String password) {
		// TODO Auto-generated method stub
		securityDAO.createUserAccount(email, SecurityUtils.getEncryptedPassword(password));
		
	}

}
