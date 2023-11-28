package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDao;
import com.masai.dao.AccountDaoImpl;
import com.masai.model.Account;

public class WithdrawUseCase {

	public static void main(String[] args) {

		AccountDao dao = new AccountDaoImpl();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Your A/c No. : ");
		int accno = sc.nextInt();

		Account account = dao.findAccount(accno);

		if (account == null) {
			System.out.println("A/c Does Not Exit...");
		} else {

			System.out.print("Enter Withdrawal Amount : ");
			int amount = sc.nextInt();
			
			
			if(amount <= account.getBalance()) {
				
				account.setBalance(account.getBalance() - amount);
				
				
				if (dao.updateAccount(account)) {
					System.out.println("Withdrawn Successfully...");
				} else {
					System.out.println("Techinical Error...");
				}
				
			} else {
				System.out.println("Insufficient Funds...");
			}
			
		}

	}

}
