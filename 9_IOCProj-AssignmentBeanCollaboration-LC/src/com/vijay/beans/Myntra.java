package com.vijay.beans;

import java.util.Arrays;
import java.util.Random;

public class Myntra {
	private PaymentGateway pg=null;
	private Courier courier=null;
	//2-param constructor for Constructor injection
	public Myntra(PaymentGateway pg,Courier courier) {
	 System.out.println("Myntra.2-param constructor");
	 this.pg=pg;
	 this.courier=courier;
	}
	//business logic
	public String order(String[] items, double[] mrps) {
		double total=0.0;
		String txStatus=null,ordStatus=null;
		//Generate random transaction Id and order ID
		Random r=new Random();
		int transactionId=r.nextInt(76543);
		int orderId=r.nextInt(10009);
		//calculate the bill
		for(double price:mrps) {
			total=total+price;
		}
		//invoke respective payment and courier logics
		txStatus=pg.transfer(total);
		ordStatus=courier.deliver(orderId);
		//complete order details with status of order and transaction and INVOICE
		return "Items list : "+Arrays.toString(items)+"\n"
				+ "Total "+txStatus+ "\n"+ordStatus+"\n"
				+"Transaction ID : "+transactionId;
				
	}//order
	
	
}//class
