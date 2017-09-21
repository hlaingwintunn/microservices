package com.hlaing.accounts.dao;

import java.util.List;

import com.hlaing.accounts.model.Account;

public interface AccountRepository {

	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
