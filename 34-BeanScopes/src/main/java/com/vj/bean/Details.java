package com.vj.bean;

import java.util.Date;

public class Details {

	private long aadharNo;
	private int age;
	private String name;
	private Date dob, dom, doj;

	public Details(long aadharNo, int age, String name, Date dob, Date dom, Date doj) {
		System.out.println("Details.Details:: 6-param constructor");
		this.aadharNo = aadharNo;
		this.age = age;
		this.name = name;
		this.dob = dob;
		this.dom = dom;
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Details [aadharNo=" + aadharNo + ", age=" + age + ", name=" + name + ", dob=" + dob + ", dom=" + dom
				+ ", doj=" + doj + "]";
	}

}
