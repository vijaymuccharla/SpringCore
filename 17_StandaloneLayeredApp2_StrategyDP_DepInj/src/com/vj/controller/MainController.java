package com.vj.controller;

import com.vj.dto.EmployeeDTO;
import com.vj.service.EmployeeServiceImpli;
import com.vj.vo.EmployeeVO;

public final class MainController {

	private EmployeeServiceImpli service;

	public MainController(EmployeeServiceImpli service) {
		System.out.println("MainController : 1-param constructor");
		this.service = service;
	}

	public String handle(EmployeeVO vo) throws Exception{

		EmployeeDTO dto=null;
		String result=null;
		//convert VO into DTO and set to DTO object
		dto=new EmployeeDTO();
		
		dto.setEmpId(Integer.parseInt(vo.getEmpId()) );
		dto.setEmpName(vo.getEmpName());
		dto.setEmpDept(vo.getDept());
		dto.setCompany(vo.getCompany());
		dto.setBaseSal(Float.parseFloat(vo.getBaseSal())  );

		//call Service method by passing DTO object
		result=service.register(dto);

		return result;

	}//process

}//class