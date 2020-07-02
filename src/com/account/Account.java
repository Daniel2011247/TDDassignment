package com.account;

public class Account {
	
	private int accountBalance;

	public void depositMoney(int amount) {
		accountBalance += amount;
	}

	public int getAccountBalance() {
		return accountBalance;		
	}
}
