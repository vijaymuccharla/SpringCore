package com.vj.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vj.controller.MainController;
import com.vj.vo.EmployeeVO;

/*
 	SQL >CREATE TABLE `hibtest`.`layered_employee1` (
		  `eid` INT NOT NULL,
		  `ename` VARCHAR(45) NULL,
		  `dept` VARCHAR(45) NULL,
		  `company` VARCHAR(45) NULL,
		  `ctc` FLOAT(10) NULL,
		  PRIMARY KEY (`eid`));
*/

public class EmployeeRegistration_StandaloneLayeredApp {

	public static void main(String[] args) {
		EmployeeVO vo=null;
		Scanner scn=null;
		BeanFactory factory=null;
		System.out.println("******* Layered app to register New Employee ******** ");
		
		//read required inputs/values as String and set them to VO object
		scn=new Scanner(System.in);
		vo=new EmployeeVO();
		
		System.out.println("Enter name :: ");
		vo.setEmpName(scn.next());
		System.out.println("Enter Department :: ");
		vo.setDept(scn.next());
		System.out.println("Enter Company name :: ");
		vo.setCompany(scn.next());
		System.out.println("Enter Base Salary :: ");
		vo.setBaseSal(scn.next());
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/vj/cfgs/applicationContext.xml"));
		
		//get Controller object using bean Id
		MainController control=factory.getBean("getController", MainController.class);
		
		//invoke processing method passing the employee object VO
		try {
			//call handler/controller with VO
			String result= control.handle(vo);
			//print result
			System.out.println(result);
			
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}//main
	
}//class
