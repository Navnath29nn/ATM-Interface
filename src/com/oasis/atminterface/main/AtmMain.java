package com.oasis.atminterface.main;

import java.util.Scanner;

import com.oasis.atminterface.resource.AtmOperationImpl;
import com.oasis.atminterface.resource.AtmOperationInter;

public class AtmMain {

	public static void main(String[] args) {
		AtmOperationInter ob = new AtmOperationImpl();
		int atmnumber= 99225765;
		int atmpin = 9999;
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome To Oasis ATM MAchine !!!");
		System.out.println("Enter Atm Number : ");
		int atmNumber = s.nextInt();
		System.out.println("Enter Atm pin : ");
		int pin = s.nextInt();
		if((atmnumber == atmNumber) && (atmpin == pin) ) {
			while(true) {
				System.out.println("1.View The Avilable Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View The Ministatement\n5.Exit");
				System.out.println("Enter The Choice : ");
				int ch = s.nextInt();
				if (ch == 1) {
					ob.viewBalance();
					
				}
				else if (ch == 2) {
					System.out.println("Enter Withdraw Amount : ");
					double withdrawAmount = s.nextDouble();
					ob.withdrwaAmount(withdrawAmount);
					
				}
				else if (ch == 3) {
					System.out.println("Enter Amount To Deposit :");
					double depositAmount = s.nextDouble();
					ob.depositAmount(depositAmount);
					
				}
				else if (ch == 4) {
					ob.viewMiniStatement();
					
				}
				else if (ch == 5) {
					System.out.println("Collect your ATM Card\n Thank for using ATM Machine..!!");
					System.exit(0);
				}
				else {
					System.out.println("Please Enter Correct Choice");
				}
			}
			
		}
		else {
			System.out.println("Incorrect atmnumber & PIN");
			System.exit(0);
		}

	}

}
