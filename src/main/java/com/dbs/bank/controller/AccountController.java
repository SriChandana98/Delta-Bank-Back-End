package com.dbs.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.bank.bean.Account;
import com.dbs.bank.service.AccountServiceImpl;

@RestController
@RequestMapping("/bank")
public class AccountController {
@Autowired	
AccountServiceImpl serviceObj;
	@GetMapping("/test")
	public String test()
	{
		return "this test";
	}
	@PostMapping("/test")
	public Account insertAccount(@RequestBody Account account)
	{
		//System.out.println("In controler insert menthod");
		return serviceObj.save(account);
	}
	@PutMapping("/test/{accountNo1}/{accountNo2}/{amount}")
	public void fundTransfer(@PathVariable Long accountNo1,@PathVariable Long accountNo2, @PathVariable Double amount )
	{
		System.out.println("qqqqqqqqqqqq");
		serviceObj.fundTransfer(accountNo1, accountNo2, amount);
	}
}
