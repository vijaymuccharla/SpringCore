package com.vj.beans;

import java.util.Date;
import java.util.List;

public class ListCollectionValues {
	
	private List<Integer> marks;
	private List<Date> dates;
	
	public ListCollectionValues() {
			System.out.println("ListCollectionValues : 0-param constructor");
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public List<Date> getDates() {
		return dates;
	}

	public void setDates(List<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return "ListCollectionValues [marks=" + marks + ", dates=" + dates + "]"+"-->"+dates.getClass();
	}

	
	

}
