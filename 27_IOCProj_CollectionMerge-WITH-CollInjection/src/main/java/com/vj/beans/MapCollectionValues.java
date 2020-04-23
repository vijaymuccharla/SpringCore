package com.vj.beans;

import java.util.Date;
import java.util.Map;

public class MapCollectionValues {

	private Map<String,Long> contacts;
	private Map<String,Date> holidayDate;
	
	public MapCollectionValues() {
		System.out.println("MapCollectionValues : 0-param constructor");
	}

	public Map<String, Long> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, Long> contacts) {
		this.contacts = contacts;
	}

	public Map<String, Date> getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(Map<String, Date> holidayDate) {
		this.holidayDate = holidayDate;
	}

	@Override
	public String toString() {
		return "MapCollectionValues [contacts=" + contacts + ", holidayDate=" + holidayDate + "]" +"--->"+holidayDate.getClass();
	}
	
	
	
}
