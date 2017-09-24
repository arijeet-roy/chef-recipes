package com.project.chef.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.chef.dao.AccountDao;
import com.project.chef.model.Account;
import com.project.chef.model.Login;

public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao accountDao;
	
	public AccountServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public void register(Account account) {
		// TODO Auto-generated method stub
		accountDao.register(account);
	}

	public Account validateAccount(Login login) {
		// TODO Auto-generated method stub
		return accountDao.validateAccount(login);
	}

}
