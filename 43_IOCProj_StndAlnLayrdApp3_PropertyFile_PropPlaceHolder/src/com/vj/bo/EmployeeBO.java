package com.vj.bo;


public final class EmployeeBO {


	private String empName;
	private String dept;
	private String company;
	private float empSal,baseSal,grossSal;

	public EmployeeBO() {
		System.out.println("EmployeeBO : 0-param constructor");
	}


	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public float getBaseSal() {
		return baseSal;
	}

	public void setBaseSal(float baseSal) {
		this.baseSal = baseSal;
	}

	public float getGrossSal() {
		return grossSal;
	}

	public void setGrossSal(float grossSal) {
		this.grossSal = grossSal;
	}




}
