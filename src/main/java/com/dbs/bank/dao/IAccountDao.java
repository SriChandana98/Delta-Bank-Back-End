package com.dbs.bank.dao;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.mariadb.jdbc.internal.common.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.bank.bean.Account;
@Repository
public interface IAccountDao extends JpaRepository<Account, Long>{
	 //@PersistenceContext EntityManager entityManager;
	public Account save(Account account);
	public Optional<Account> findByAccountNo(Long accountNo);
	public List<Account> findAll();
	public void deleteByAccountNo(Long accountNo);
	public boolean existsByAccountNo(Long accountNo);
	
}
