package com.project.chef.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.project.chef.model.Account;
import com.project.chef.model.Login;

public class AccountDaoImpl implements AccountDao {

	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	public AccountDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	public void register(Account account) {
		// TODO Auto-generated method stub
		String registerQuery = "insert into accounts values(?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(registerQuery,
				new Object[] { account.getUserName(), account.getPassword(), account.getFirstName(),
						account.getLastName(), account.getEmailId(), account.getAddress(), account.getPhoneNum(),
						account.getDob() });
	}

	public Account validateAccount(Login login) {
		// TODO Auto-generated method stub
		String validateQuery = "select * from accounts where userName='" + login.getUserName() + "' and password='"
				+ login.getPassword() + "'";
		List<Account> users = jdbcTemplate.query(validateQuery, new AccountMapper());
		return users.size() > 0 ? users.get(0) : null;
	}

}
