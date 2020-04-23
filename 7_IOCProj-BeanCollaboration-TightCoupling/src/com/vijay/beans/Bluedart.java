package com.vijay.beans;

public class Bluedart {

	public Bluedart() {
	System.out.println("Bluedart.0-param constructor()");
	}
	
	public String deliver(int orderId) {
		return "Order with ID : "+orderId+" is delivered via Bluedart";
	}
	
}
