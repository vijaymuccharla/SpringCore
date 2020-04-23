package com.vj.beans;

import java.util.Arrays;
import java.util.Date;

public class ArrayOfValues{

	private int marks[];
	private Date impDate[];
	
	
	
	public ArrayOfValues() {
		System.out.println("ImportantDates:  0- param contructor");
	}
	
	
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public Date[] getImpDate() {
		return impDate;
	}
	public void setImpDate(Date[] impDate) {
		this.impDate = impDate;
	}
	@Override
	public String toString() {
		return "ArrayOfValues [marks=" + Arrays.toString(marks) + ", impDate=" + Arrays.toString(impDate) + "]--->"+impDate.getClass();
	}
	
	
	
	
}
