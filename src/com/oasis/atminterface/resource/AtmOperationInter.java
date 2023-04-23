package com.oasis.atminterface.resource;

public interface AtmOperationInter {
	public void viewBalance();
	public void withdrwaAmount(double withdrwaAmount);
	public void depositAmount(double depositAmount);
	public void viewMiniStatement();

}
