package com.vj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vj.beans.Smartphone;

public class TestBeanInheritance {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vj/cfgs/applicationContext.xml");
				
		//get beans
		
//		Smartphone phone=factory.getBean("ios", Smartphone.class); 		//cannot access Abstract BEAN
		
		
		Smartphone phone1=factory.getBean("myPhone", Smartphone.class);
		System.out.println(phone1);
		System.out.println("\n\n****************************\n\n");
		
		
		Smartphone phone2=factory.getBean("herPhone", Smartphone.class);
		System.out.println(phone2);
		System.out.println("\n****************************");
		
	}//main
	
}//class
