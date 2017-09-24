package com.project.chef.service;

import com.project.chef.model.Account;
import com.project.chef.model.Login;

public interface AccountService {

	void register(Account account);
	
	Account validateAccount(Login login);

}
