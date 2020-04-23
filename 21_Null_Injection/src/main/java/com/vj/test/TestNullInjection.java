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
		Details d1=factory.getBean("info1", Details.class);
		System.out.println(d1);
		
		System.out.println("\n\n ____________________________");
		Details d2=factory.getBean("info2", Details.class);
		System.out.println(d2);
		
		System.out.println("\n\n ____________________________");
		Details d3=factory.getBean("info3", Details.class);
		System.out.println(d3);
		
		
	}//main
	
}//class
