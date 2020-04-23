package com.vj.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vj.controller.MainController;
import com.vj.vo.StudentVO;

public class RealtimeDepInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Scanner scn=null;
		StudentVO vo=null;
		
		
		//create IOC container
		factory= new XmlBeanFactory(new ClassPathResource("com/vj/cfgs/applicationContext.xml"));
		
		//read inputs as Strings from enduser
		scn=new Scanner(System.in);
		
		//set these values to VO class props
				vo=new StudentVO();
				
		System.out.print("Enter Student Number :: ");
		vo.setSno(scn.next());
		System.out.print("Enter Student Name :: ");
		vo.setSname(scn.next());
		System.out.print("Enter student address :: ");
		vo.setSaddrs(scn.next());
		System.out.print("Enter 1st Subject marks :: ");
		vo.setM1(scn.next());
		System.out.print("Enter 2nd Subject marks :: ");
		vo.setM2(scn.next());
		System.out.print("Enter 3rd Subject marks :: ");
		vo.setM3(scn.next());
		
		
		//get Controller class object
		MainController controller=factory.getBean("controller", MainController.class);
		
		//invoke methods
		try {
			String result=controller.handle(vo);
			
			System.out.println("Student result :: "+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
	
}//class
