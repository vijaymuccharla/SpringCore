package com.vj.beans;

import java.util.Date;
import java.util.Set;

public class SetCollectionValues {

	private Set<Long> aadharNum;
	private Set<Date>  doBirth;

	public SetCollectionValues() {
		System.out.println("SetCollectionValues : 0-param constructor");
	}

	public Set<Long> getAadharNum() {
		return aadharNum;
	}

	public void setAadharNum(Set<Long> aadharNum) {
		this.aadharNum = aadharNum;
	}



	public Set<Date> getDoBirth() {
		return doBirth;
	}

	public void setDoBirth(Set<Date> doBirth) {
		this.doBirth = doBirth;
	}

	@Override
	public String toString() {
		return "SetCollectionValues [aadharNum=" + aadharNum + ", doBirth=" + doBirth + "]"+"--->"+doBirth.getClass();
	}



}
