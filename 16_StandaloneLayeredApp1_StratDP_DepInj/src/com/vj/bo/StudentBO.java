package com.vj.bo;

public final class StudentBO {

	private int sno,total;
	private double avg;
	private String sname,saddrs,result;
	
	public StudentBO() {
		System.out.println("StudentBO : 0-param constructor");
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "StudentBO [sno=" + sno + ", total=" + total + ", avg=" + avg + ", sname=" + sname + ", saddrs=" + saddrs
				+ ", result=" + result + "]";
	}//toString
	
}//class
