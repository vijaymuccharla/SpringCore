package com.vj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vj.bean.Details;

public class TestNullInjection {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//create IOC container
		factory= new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vj/cfgs/applicationContext.xml");
		
		//get bean
		
//		Details d1=factory.getBean("com.vj.bean.Details", Details.class);
													//(or)
//		Details d1=factory.getBean(Details.class.getName(), Details.class);
													//(or)
		Details d1=factory.getBean("com.vj.bean.Details#0", Details.class);
		System.out.println(d1);
		
		System.out.println("\n\n ____________________________");
		Details d2=factory.getBean("com.vj.bean.Details#1", Details.class);
		System.out.println(d2);
		
		System.out.println("\n\n ____________________________");
		Details d3=factory.getBean("com.vj.bean.Details#2", Details.class);
		System.out.println(d3);
		
		
	}//main
	
}//class
