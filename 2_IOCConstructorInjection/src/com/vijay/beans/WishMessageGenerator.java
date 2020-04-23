package com.vijay.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date=null;		//bean property
	//give 1-param constructor to initialise date bean with Date object
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator.(0-param) const");
		this.date=date;
		System.out.println(date);
	}
	//one setter method 
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date=date;
		System.out.println(date);
	}
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		System.out.println(date);
			int hour=0;
			hour=date.getHours();
			if(hour<12)
				return "Good Morning "+user;
			else if(hour<16)
				return "Good Afternoon"+user;
			else if(hour<20)
				return "Good Evening"+user;
			else
			return "Good Morning "+user;
			}
		

	
	
	}
	
	

