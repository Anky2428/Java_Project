package com.amdocs.bank;

//this is Base class for savingaccount and currentAccount
public class BankAccount {
	
	private double balance;
	
	//constructor of bankaccount class ...initialy it will assign balance 
	public BankAccount(double bal)
	{
		this.balance = bal;
		System.out.println("bank Account created successful\n");
	}
	
	//getter method to get the balance
	public double getBalance() {
		return balance;
	}

	//setter method to set the balance
	public void setBalance(double balance) {
		this.balance = balance;
	}	
	
	// deposite method to add balance into the account
	public void deposite(double dep)
	{
		//checking deposite  amaount should greater than 0
		if(dep > 0 )
		{
			this.balance = this.balance + dep;
			System.out.println("Transaction successful .... Money has been deposited");
		}
		else
		{
			System.out.println("Invalid deposite");
		}
	}

	// withdraw method to withdrawlamount from the account
	public void withdraw(double with)
	{
		//amount should be less than current balance and should be greater than 0
		if(with < balance && with > 0)
		{
			this.balance = balance - with; 
			System.out.println("Transaction successful .... Money withdrawn ");			
		}
		else
		{
			System.out.println("Please enter valid amount");
		}
	}
	
	//transfer method  
	public void transfer(double amount , BankAccount b1) ////b1 will be of type BankAccount
	{
		if(amount <= this.balance)
		{
			this.withdraw(amount);     ///withdrawing money from calling object
			b1.deposite(amount);		///depositing money into passed object
			System.out.println("\nTransfer successful..........\n");
		}
		else
		{
			System.out.println("insuffiecient balance");
		}
	}

	public double showBalance()
	{
		return this.balance;
	}
}
