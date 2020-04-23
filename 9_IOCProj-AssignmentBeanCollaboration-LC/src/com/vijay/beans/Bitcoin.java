package com.vijay.beans;

public class Bitcoin implements PaymentGateway {
	
	public Bitcoin() {
	 System.out.println("Bitcoin .Bitcoin (0-param constructor");
	}
	@Override
	public String transfer(double amount) {
		return "payment of "+amount+"/- is successful via Bitcoin ";
	}

}
