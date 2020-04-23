package com.vijay.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.vijay.beans.WishMessageGenerator;


public class SetterInjectionTest {

	public static void main(String[] args) {
		Resource resource=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		//Hold spring bean file
		resource=new FileSystemResource("src/com/vijay/cfgs/applicationContext.xml");
		//create Bean factory IOC container
		factory= new XmlBeanFactory(resource);
		//get target bean class object
		Object obj=factory.getBean("wmg");
		//invoke b.metod directly
		//	System.out.println(obj.generateWishMessage("raja"));	//CE
		//type cast
		generator=(WishMessageGenerator)obj;
		//invoke b.method
		System.out.println("Result :: " +generator.generateWishMessage("Vijay"));

	}//main

}//class

