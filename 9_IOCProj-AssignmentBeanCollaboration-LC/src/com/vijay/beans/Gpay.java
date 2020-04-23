package com.vijay.beans;

public class Gpay implements PaymentGateway {
	
	public Gpay() {
	 System.out.println("Gpay.Gpay(0-param constructor");
	}
	@Override
	public String transfer(double amount) {
		return "payment of "+amount+"/- is successful via Gpay";
	}

}
