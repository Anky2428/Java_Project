package com.amdocs.bank;

//Creating currentAccount class which is derived from BankAccount
public class CurrentAccount extends BankAccount {

	//constructor of CurrentAccount class
	private int penalty = 200;
	public CurrentAccount(double bal) {
		super(bal);    //calling the construstor of base class BankAccount
	}
	
	//overriding withdraw method of BankAccount class this will apply penalty on withdraw from currentAccount
	public void withdraw(double with)
	{
		//checking whether the amount is greater than 0 and amount should be less than current balance +200
		if(with + penalty <= getBalance()  && with > 0)
		{
			double bal = getBalance();
			setBalance(bal - with - penalty);
			//System.out.println("Thank you .....remaining balance : " + getBalance());			
		}
		else
		{
			System.out.println("Please enter valid amount");
		}
	}
	

}
