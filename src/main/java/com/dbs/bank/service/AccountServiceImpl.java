package com.dbs.bank.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.bank.bean.Account;
import com.dbs.bank.dao.IAccountDao;
@Transactional
@Service
public class AccountServiceImpl implements IAccountService{
	@Autowired
	IAccountDao daoObj;

	@Override
	public void fundTransfer(Long accountNo1, Long accountNo2, Double amount) {
		// TODO Auto-generated method stub
		System.out.println("pppppppppp");
		Double balance1, balance2, balTemp;
		System.out.println(daoObj.existsByAccountNo(accountNo1));
		System.out.println(daoObj.existsByAccountNo(accountNo2));
		if(daoObj.existsByAccountNo(accountNo1) && daoObj.existsByAccountNo(accountNo2))
		{
			System.out.println("uuuuuuuuuuuu");
			Account account1, account2;
			Optional<Account> accountDetails1= daoObj.findByAccountNo(accountNo1);
			account1 = accountDetails1.get();
			balance1 = account1.getAccountBalance();
			//withdrawing money from account number 1
			balTemp=balance1-amount;
			if(balTemp>5000)
			{	balance1=balance1-amount;
				account1.setAccountBalance(balance1);
				accountDetails1.get().setAccountBalance(balance1);
				daoObj.save(account1);
			}
			//depositing money in account number 2
			Optional<Account> accountDetails2= daoObj.findByAccountNo(accountNo2);
			account2=accountDetails2.get();
			balance2= account2.getAccountBalance();
			balance2= balance2+amount;
			accountDetails2.get().setAccountBalance(balance2);
				daoObj.save(account2);
			}
		}

	@Override
	public Account save(Account account) {
		// TODO Auto-generated method stub
		return daoObj.save(account);
	}

	
	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public Optional<Account> findByAccountNo(Long accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByAccountNo(Long accountNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsByAccountNo(Long accountNo) {
		// TODO Auto-generated method stub
		return false;
	}
		
	}

	
