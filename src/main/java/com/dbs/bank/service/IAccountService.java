package com.dbs.bank.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.dbs.bank.bean.Account;
@Transactional
@Service

public interface IAccountService {
	public Account save(Account account);
	public Optional<Account> findByAccountNo(Long accountNo);
	public List<Account> findAll();
	public void deleteByAccountNo(Long accountNo);
	public boolean existsByAccountNo(Long accountNo);
	void fundTransfer(Long accountNo1, Long accountNo2, Double amount);
	

}
