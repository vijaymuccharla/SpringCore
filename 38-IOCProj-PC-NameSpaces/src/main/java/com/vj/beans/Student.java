package com.vj.beans;

import java.util.Date;

public class Student {

	private int stdId;
	private String stdname,stdAdrrs;
	private Course course;
	private Date dob;



	public void setStdId(int stdId) {
		this.stdId = stdId;
	}



	public void setStdname(String stdname) {
		this.stdname = stdname;
	}



	public void setStdAdrrs(String stdAdrrs) {
		this.stdAdrrs = stdAdrrs;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public void setDob(Date dob) {
		this.dob = dob;
	}



	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdname=" + stdname + ", stdAdrrs=" + stdAdrrs + ", course=" + course
				+ ", dob=" + dob + "]";
	}



}
