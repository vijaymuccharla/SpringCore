package com.vj.service;

import java.util.List;

import com.vj.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	
	public  List<EmployeeDTO> fetchEmpsByDesgs(String desg1,String desg2)throws Exception;

}
