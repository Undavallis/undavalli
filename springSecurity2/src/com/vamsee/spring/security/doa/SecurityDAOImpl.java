package com.vamsee.spring.security.doa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SecurityDAOImpl implements SecurityDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String DEFAULT_ROLE="ROLE_USER";
	
	@Override
	public void createUserAccount(String email, String password) {
		// TODO Auto-generated method stub
		String insertUserSQL = "INSERT INTO security_user(email, password, enabled) VALUES (?, ?, ?)";
		String insertRolesSQL = "INSERT INTO security_user_role(id, email, role)VALUES (?, ?, ?)";
		jdbcTemplate.update(insertUserSQL, new Object[]{email,password,Boolean.TRUE});
		jdbcTemplate.update(insertRolesSQL, new Object[]{System.nanoTime(),email,DEFAULT_ROLE});
	}

}
