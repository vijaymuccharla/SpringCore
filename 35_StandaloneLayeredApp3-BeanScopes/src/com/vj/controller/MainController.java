package com.vj.controller;

import com.vj.dto.EmployeeDTO;
import com.vj.service.EmployeeServiceImpli;
import com.vj.vo.EmployeeVO;

public final class MainController {

	private EmployeeServiceImpli service;
	EmployeeDTO dto;

	public MainController(EmployeeServiceImpli service, EmployeeDTO dto) {
		System.out.println("MainController : 2-param constructor");
		this.service = service;
		this.dto=dto;
	}

	public String handle(EmployeeVO vo) throws Exception{
		String result=null;
	
		//convert VO into DTO and set to DTO object
		dto.setEmpName(vo.getEmpName());
		dto.setEmpDept(vo.getDept());
		dto.setCompany(vo.getCompany());
		dto.setBaseSal(Float.parseFloat(vo.getBaseSal())  );

		//call Service method by passing DTO object
		result=service.register(dto);

		return result;

	}//process

}//class