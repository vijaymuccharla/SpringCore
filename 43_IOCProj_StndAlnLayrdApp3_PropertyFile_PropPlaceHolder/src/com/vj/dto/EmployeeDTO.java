package com.vj.dto;

public final class EmployeeDTO {


	private String empName,empDept,company;
	private float baseSal;

	public EmployeeDTO() {
		System.out.println("EmployeeDTO : o-param constructor ");
	}


	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getBaseSal() {
		return baseSal;
	}
	public void setBaseSal(float baseSal) {
		this.baseSal = baseSal;
	}


}
