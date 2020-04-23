package com.vj.test;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vj.controller.MainController;
import com.vj.dto.EmployeeDTO;

public class NestedApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext pCtxt=null,cCtxt=null;
		MainController controller=null;
		List<EmployeeDTO> listDTO=null;
		
		//create Parent IOC container
		pCtxt=new ClassPathXmlApplicationContext("com/vj/cfgs/business-tier-beans.xml");
		//create child IOC container
		cCtxt=new ClassPathXmlApplicationContext(new String[] {"com/vj/cfgs/presentation-tier-beans.xml"},pCtxt);
//		
//		
		
		//get Controller class object
		controller=cCtxt.getBean("controller",MainController.class);
		//invoke methods
		try {
			listDTO=controller.fetchEmpsByDesgs("CLERK", "MANAGER");
			listDTO.forEach(dto->{
				System.out.println(dto);
				
			});
		
		}//try
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("hello...");
		}
		
		//close containers
		((AbstractApplicationContext) pCtxt).close();
		((AbstractApplicationContext) cCtxt).close();
		
	}//main
}//class
