package com.vijay.beans;

public class DTDC {

	public DTDC() {
	System.out.println("DTDC.0-param constructor()");
	}
	
	public String deliver(int orderId) {
		return "Order with ID : "+orderId+" is delivered via DTDC";
	}
	
}
