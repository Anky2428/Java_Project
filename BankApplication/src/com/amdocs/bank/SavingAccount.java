package com.amdocs.bank;

//Creating SavingAccount class which is derived from BankAccount
public class SavingAccount extends BankAccount {

	private double interestRate = 0.03;
	public SavingAccount(double bal) {
		//constructor of SavingAccount class
		super(bal);
	}

	//overriding deposite method of BankAccount class this will apply interest on deposite into SavingAccount
	public void deposite(double dep)
	{
		//checking whether the amount is greater than 
		if(dep > 0)
		{
			double bal = getBalance();
			setBalance(bal + dep + dep * interestRate);	

		}
		else
		{
			System.out.println("Invalid amount Please enter valid amount");
		}
	}

}
