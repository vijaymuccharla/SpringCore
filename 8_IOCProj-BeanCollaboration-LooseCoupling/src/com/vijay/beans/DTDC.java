package com.vijay.beans;

public class DTDC implements Courier{

	public DTDC() {
	System.out.println("DTDC.0-param constructor()");
	}
	@Override
	public String deliver(int orderId) {
		return "Order with ID : "+orderId+" is delivered via DTDC";
	}
	
}
