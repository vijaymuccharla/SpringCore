package com.vijay.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	private Courier courier=null;
	public Flipkart() {
		System.out.println("Flipkart.0-param constructor");
	}
	//setter method for setter injection
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	public String shopping(String[] items, double[] prices) {
		double total=0;
		//random order ID
		Random rand= new Random();
		//get the number
		int oid=rand.nextInt(101010);
		//deliver order
		String status=courier.deliver(oid);
		//calculate total bill
		for(double p: prices) {
			total=total+p;
		}
		//print the invoice
		return "Items : "+Arrays.toString(items)+"\n"+
				"Total bill : "+total+"\n"+
				"Delivery Status :"+status;
	}
	
}
