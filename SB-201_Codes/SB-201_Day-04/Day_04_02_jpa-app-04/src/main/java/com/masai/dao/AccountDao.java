package com.masai.dao;

import com.masai.model.Account;

public interface AccountDao {
	
	boolean createAccount(Account account);
	
	boolean deleteAccount(int accno);
	
	boolean updateAccount(Account account);
	
	Account findAccount(int accno);

}
