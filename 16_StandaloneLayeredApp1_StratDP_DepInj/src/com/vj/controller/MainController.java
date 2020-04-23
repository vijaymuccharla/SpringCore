package com.vj.controller;

import com.vj.dto.StudentDTO;
import com.vj.service.StudentOperationService;
import com.vj.vo.StudentVO;

public final class MainController {

 	private StudentOperationService service;

 	//constructor injection
	public MainController(StudentOperationService service) {
		System.out.println("MainController : 1-param constructor");
		this.service = service;
	}
	
	public String handle(StudentVO vo) throws Exception{
		StudentDTO dto=null;
		String result=null;
		//Convert VO class obj to DTO class obj
		dto=new StudentDTO();
		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setSaddrs(vo.getSaddrs());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		
		//use service
		result=service.register(dto);
		return result;
	}
 	
 	
	
}
