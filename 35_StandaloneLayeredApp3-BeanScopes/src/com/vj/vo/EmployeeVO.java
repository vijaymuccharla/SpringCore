package com.vj.vo;


public final class EmployeeVO {

	private String empName,dept,company,baseSal;
	
		public EmployeeVO() {
			System.out.println("EmployeeVO:  0-param constructor");
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

		public String getBaseSal() {
			return baseSal;
		}

		public void setBaseSal(String baseSal) {
			this.baseSal = baseSal;
		}
	
		

}
