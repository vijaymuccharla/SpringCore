package com.vj.dto;

import java.io.Serializable;

public final class StudentDTO implements Serializable{

	private int sno,m1,m2,m3;
	private String sname,saddrs;
	
	//0-param const
	public StudentDTO() {
		System.out.println("StudentDTO : 0-param");
	}

	//setter methods for setter injections	
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddrs() {
		return saddrs;
	}

	public void setSaddrs(String saddrs) {
		this.saddrs = saddrs;
	}

	@Override
	public String toString() {
		return "StudentDTO [sno=" + sno + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", sname=" + sname + ", saddrs="
				+ saddrs + "]";
	}
	
	
	
}
