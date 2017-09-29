package com.hlaing.microservices.dao;

import java.util.List;

import com.hlaing.microservices.model.Account;

/**
 * 
 * @author wintun
 *
 */
public interface AccountRepository {
	List<Account> getAllAccounts();

	Account getAccount(String number);
}
