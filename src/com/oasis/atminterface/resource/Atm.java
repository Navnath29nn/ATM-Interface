package com.oasis.atminterface.resource;

public class Atm {
	private double balance;
	private double depositamount;
	private double withdrawamount;
	
	//default constructor
	
	public Atm(){
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDepositamount() {
		return depositamount;
	}

	public void setDepositamount(double depositamount) {
		this.depositamount = depositamount;
	}

	public double getWithdrawamount() {
		return withdrawamount;
	}

	public void setWithdrawamount(double withdrawamount) {
		this.withdrawamount = withdrawamount;
	}
	
	//getter setter
	

}
