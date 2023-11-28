package com.masai.dao;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

import jakarta.persistence.EntityManager;

public class AccountDaoImpl implements AccountDao {

	@Override
	public boolean createAccount(Account account) {
		
		boolean flag = false;
		
		
		EntityManager em = null;
		
		
		try {
			
			em = EMUtil.provideEntityManager();
			
			
			em.getTransaction().begin();
			
			em.persist(account);
			
			flag = true;
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
		
		
		return flag;
		
	}

	@Override
	public boolean deleteAccount(int accno) {
		
		boolean flag = false;
		
		
		EntityManager em =  EMUtil.provideEntityManager();
			
			
		Account account = em.find(Account.class, accno);
		
		
		if(account != null) {
			
			em.getTransaction().begin();
			
			em.remove(account);
			
			flag = true;
			
			em.getTransaction().commit();
			
		}
		
		
		em.close();
		
		
		return flag;
		
	}

	@Override
	public boolean updateAccount(Account account) {
		
		boolean flag = false;
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		Account existingAccount = em.find(Account.class, account.getAccno());
		
		
		if(existingAccount != null) {
			
			em.getTransaction().begin();
			
			em.merge(account);
			
			flag = true;
			
			em.getTransaction().commit();
			
		}
		
		
		em.close();
		
		
		return flag;
		
	}

	@Override
	public Account findAccount(int accno) {
		return EMUtil.provideEntityManager().find(Account.class, accno);
	}

}
