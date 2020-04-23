package com.vijay.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.vijay.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {

		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator wm=null;
		//Hold the cfg file path
		res= new FileSystemResource("src/com/vijay/cfgs/applicationContext.xml");
		//create IOC bean factory container
		factory= new XmlBeanFactory(res);
		//get the dependent target class using the bean id 
		Object obj=factory.getBean("wmg");
		//typecast/downcast
		wm=(WishMessageGenerator)obj;
		//invoke the b.method logic
		System.out.println("Result :: "+wm.generateWishMessage("Vijay"));
		
	}//main

}//class
