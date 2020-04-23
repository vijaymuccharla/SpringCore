package com.vj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vj.bean.Details;

public class ApllicationContextContainerTest {

	public static void main(String[] args) {
		
		ApplicationContext ctxt=null;
		
//		create IOC of type "AC"
		
//		ctxt=new FileSystemXmlApplicationContext("src/main/java/com/vj/cfgs/applicationContext.xml");
//		ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");	// if class path added to BuildPath com/vj/cfgs
		ctxt=new ClassPathXmlApplicationContext("com/vj/cfgs/applicationContext.xml");
		
		Details d1=ctxt.getBean("info1", Details.class);
		System.out.println(d1);
		
		System.out.println("\n\n ____________________________");
		Details d2=ctxt.getBean("info2", Details.class);
		System.out.println(d2);
		
		System.out.println("\n\n ____________________________");
		Details d3=ctxt.getBean("info3", Details.class);
		System.out.println(d3);
		
		
		System.out.println("\n\n ____________________________");
		System.out.println("********* Used Bean Alias Name in <bean> tag with name='  ' attribute********\n");
		Details d4=ctxt.getBean("alias1", Details.class);
		System.out.println(d4);
		
		System.out.println("\n\n ____________________________");
		Details d5=ctxt.getBean("alias2", Details.class);
		System.out.println(d5);
		
		System.out.println("\n\n ____________________________");
		System.out.println("********* Used Bean Alias Name in <alias> tag ********\n");
		Details d6=ctxt.getBean("alias3", Details.class);
		System.out.println(d6);
		
		System.out.println("\n\n ____________________________");
		Details d7=ctxt.getBean("alias4", Details.class);
		System.out.println(d7);
		
		
	}//main
	
}//class
