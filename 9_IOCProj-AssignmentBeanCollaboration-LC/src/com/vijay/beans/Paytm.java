package com.vijay.beans;

public class Paytm implements PaymentGateway {
	
	public Paytm() {
	 System.out.println("Paytm.Paytm(0-param constructor");
	}
	@Override
	public String transfer(double amount) {
		return "payment of "+amount+"/- is successful via Paytm";
	}

}
