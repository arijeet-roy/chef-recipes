package com.project.chef.dao;

import com.project.chef.model.Account;
import com.project.chef.model.Login;

public interface AccountDao {

	void register(Account account);
	
	Account validateAccount(Login login);

}
