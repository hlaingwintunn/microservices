package com.hlaing.accounts.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hlaing.accounts.dao.AccountRepository;
import com.hlaing.accounts.model.Account;

@RestController
public class AccountController {
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	AccountRepository accountRepository;
	
	@GetMapping("/accounts")
	public Account[] all() {
		logger.info("accounts-microservice all() invoked");
		List<Account> accounts = accountRepository.getAllAccounts();
		logger.info("accounts-microservice all() found: " + accounts.size());
		return accounts.toArray(new Account[accounts.size()]);
	}
	
	@RequestMapping("/accounts/{id}")
	public Account byId(@PathVariable("id") String id) {
		logger.info("accounts-microservice byId() invoked: " + id);
		Account account = accountRepository.getAccount(id);
		logger.info("accounts-microservice byId() found: " + account);
		return account;
	}

}
