package com.project.chef.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.chef.model.Account;

public class AccountMapper implements RowMapper<Account>{

	public AccountMapper() {
		// TODO Auto-generated constructor stub
	}

	public Account mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setUserName(rs.getString("userName"));
		account.setPassword(rs.getString("password"));
		account.setFirstName(rs.getString("firstName"));
		account.setLastName(rs.getString("lastName"));
		account.setEmailId(rs.getString("emailId"));
		account.setAddress(rs.getString("address"));
		account.setPhoneNum(rs.getString("phoneNum"));
		account.setDob(rs.getString("dob"));
		return account;
	}

	
}
