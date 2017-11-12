package com.devone.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	@RequestMapping(value="svc/v1/public/accounts/{accountNumber}")
	public String getPublicAccountDataLinkTo(@PathVariable final int accountNumber){
		return "Public Account link to " + accountNumber;
		
	}
	
	@RequestMapping(value="svc/v1/private/accounts/{accountNumber}")
	private String getPrivateAccountDataLinkTo(@PathVariable final int accountNumber){
		return "private Account link to " + accountNumber;
		
	}

}
