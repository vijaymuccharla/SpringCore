package com.vj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vj.bean.Details;

public class ACpreinstantiationTest {

	public static void main(String[] args) {
		
		ApplicationContext ctxt=null;
		
//		create IOC of type "AC"
		
//		ctxt=new FileSystemXmlApplicationContext("src/main/java/com/vj/cfgs/applicationContext.xml");
//		ctxt=new ClassPathXmlApplicationContext("applicationContext.xml");	//if class path added to BuildPath com/vj/cfgs
		ctxt=new ClassPathXmlApplicationContext("com/vj/cfg/applicationContext.xml");
		
		/*	Details d1=ctxt.getBean("info1", Details.class);
			System.out.println(d1);
			
			System.out.println("\n\n ____________________________");
			Details d2=ctxt.getBean("info2", Details.class);
			System.out.println(d2);
		*/
		
		//analyse the no.of beans that are created by executing...***AC preinstantiates SingletonBeans**
//		all singletons are pre initialized by AC container automatically.
		//by default all beans are singletons, to change we use scope attribute in Bean tag with Prototype
		/*		**********
		Q) We have 10 beans, and we need to enable Eager Instantiation for only 5 beans. How?
		1. Use only Application container
		2. for 5 beans make scope as Singleton, other 5 as Prototype
		3. do not enable lazy-init="true" for singleton beans
		4. Do not make Prototype beans as Dependents to Singleton beans
		*/
		
	}//main
	
}//class
