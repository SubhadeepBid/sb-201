package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.model.Account;

public class DepositUseCase {
	
	public static void main(String[] args) {
		
//		Insert An Account
		/*
		 * AccountDao dao = new AccountDaoImpl();
		 * 
		 * 
		 * Account account = new Account(); account.setName("Ramesh");
		 * account.setBalance(1500);
		 * 
		 * 
		 * System.out.println(dao.createAccount(account) ? "Account Created..." :
		 * "Account Not Created...");
		 */
		
		AccountDao dao = new AccountDaoImpl();
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter Your A/c No. : ");
		int accno = sc.nextInt();
		
		
		Account account = dao.findAccount(accno);
		
		
		if(account == null) {
			System.out.println("A/c Does Not Exit...");
		} else {
			
			System.out.print("Enter Deposit Amount : ");
			int amount = sc.nextInt();
			
			
			account.setBalance(account.getBalance() + amount);
			
			
			if(dao.updateAccount(account)) {
				System.out.println("Deposited Successfully...");
			} else {
				System.out.println("Techinical Error...");
			}
			
		}
		
	}

}
