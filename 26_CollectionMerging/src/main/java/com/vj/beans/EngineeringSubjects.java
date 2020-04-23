package com.vj.beans;

import java.util.List;

public class EngineeringSubjects {

	private List<String> subjects;
	
	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "EngineeringSubjects [subjects=" + subjects + "]";
	}
	
}
