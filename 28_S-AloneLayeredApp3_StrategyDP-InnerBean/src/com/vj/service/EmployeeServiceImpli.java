package com.vj.service;

import com.vj.bo.EmployeeBO;
import com.vj.dao.EmployeeDAO;
import com.vj.dto.EmployeeDTO;

public final class EmployeeServiceImpli implements EmployeeService{

	private EmployeeDAO dao;

	public EmployeeServiceImpli(EmployeeDAO dao) {
		System.out.println("EmployeeServiceImpli : 1-param constructor");
		this.dao = dao;
	}

	@Override
	public String register(EmployeeDTO dto) throws Exception {
		float grossSal=0.0f,totalSal=0.0f;
		int result=0;
		EmployeeBO bo=null;

		//use DTO objecj to perform business operations and convert it to BO object
		bo= new EmployeeBO();

	
		bo.setEmpName(dto.getEmpName());
		bo.setDept(dto.getEmpDept());
		bo.setCompany(dto.getCompany());
		bo.setBaseSal(dto.getBaseSal());

		//calc gross sal with 30% of base sal
		grossSal=		dto.getBaseSal() + dto.getBaseSal()/100*30;
		//total CTC with -10% of gross
		totalSal=		grossSal - grossSal/100*10 + grossSal/100*20;

		//set gross sal
		bo.setGrossSal(grossSal);
		//set employee salary
		bo.setEmpSal(totalSal);

		//pass persitable BO obj to DAO
		result=dao.insert(bo);

		if(result==0)
			return "Employee Registration failed";
		else
			return "Registration success! \n Gross Salary ::"+grossSal+"\n TotalCTC ::"+totalSal;

	}//register

}//class
