package com.vj.service;

import com.vj.bo.StudentBO;
import com.vj.dao.StudentDAO;
import com.vj.dto.StudentDTO;

public final class StudentOperationServiceImpli implements StudentOperationService {

	private StudentDAO dao;

	
	//constructor injection
	public StudentOperationServiceImpli(StudentDAO dao) {
		System.out.println("StudentOperationServiceImpli : 1-param constructor");
		this.dao = dao;
	}



	@Override
	public String register(StudentDTO dto) throws Exception {
		int count=0,total=0;
		StudentBO bo=null;
		String result=null;
		double avg=0.0;
		//b.logic using inputs from dto, calculate required inputs of BO object to pass
		bo= new StudentBO();
		
		//calc total marks,avg,result
		if(dto.getM1()<35 || dto.getM2()<35 || dto.getM3()<35) 
			result="Fail";
		else
			result="pass";
		
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3;
		
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSaddrs(dto.getSaddrs());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);

		//use dao to invoke DAO method to insert into DB
		count=dao.insert(bo);
		if(count==0) 
			return "Stundent Registration Failed, no records inserted";
		else
			return "Student Registered Successfully, record inserted into DB"
					+ "\n Total marks : "+total+"\n Average : "+avg+"\n Result : "+result;
			
	}//register

}//class
