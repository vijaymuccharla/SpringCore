package com.vj.beans;

import java.util.List;
import java.util.Properties;

public class PropertiesValues {

	private Properties hotel;
	private List<Properties> menu;
	
	
	public PropertiesValues() {
		System.out.println("PropertiesValues :: 0-param contructor");
	}


	public Properties getHotel() {
		return hotel;
	}


	public void setHotel(Properties hotel) {
		this.hotel = hotel;
	}


	public List<Properties> getMenu() {
		return menu;
	}


	public void setMenu(List<Properties> menu) {
		this.menu = menu;
	}


	@Override
	public String toString() {
		return "PropertiesValues [hotel=" + hotel +"-->"+hotel.getClass()+ ", menu=" + menu + "]"+"--->"+menu.getClass();
	}
	
	
	
}
