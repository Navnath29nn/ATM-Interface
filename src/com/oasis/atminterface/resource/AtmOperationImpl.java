package com.oasis.atminterface.resource;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInter {
	Atm atm = new Atm();
	Map<Double, String> ministmt = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Avilable Balance is : "+atm.getBalance());
		
	}

	@Override
	public void withdrwaAmount(double withdrwaAmount) {
	if(withdrwaAmount%500==0) {
		if (withdrwaAmount < atm.getBalance()) {
			System.out.println(ministmt.put(withdrwaAmount, "Amount Withdrawn"));
			System.out.println( " Collect The Cash " + withdrwaAmount);
			atm.setBalance(atm.getBalance() - withdrwaAmount);
			viewBalance();
			
		}
		else {
			System.out.println("Insufficient Fund !!");
		}
	}
	else {
		System.out.println("Please Enter The Amount Of Multiple Of 500");
	}
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		System.out.println(ministmt.put(depositAmount, " Amount Withdrawn"));
		System.out.println(depositAmount + " Deposited Successfully !!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		for(Map.Entry<Double, String> m: ministmt.entrySet()) {
			System.out.println(m.getKey()+ "" + m.getValue());
		}
		
		
	}

}
