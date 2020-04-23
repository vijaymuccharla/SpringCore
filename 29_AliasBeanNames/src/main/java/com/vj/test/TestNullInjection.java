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
		
		
		System.out.println("\n\n ____________________________");
		System.out.println("********* Used Bean Alias Name in <bean> tag with name='  ' attribute********\n");
		Details d4=factory.getBean("alias1", Details.class);
		System.out.println(d4);
		
		System.out.println("\n\n ____________________________");
		Details d5=factory.getBean("alias2", Details.class);
		System.out.println(d5);
		
		System.out.println("\n\n ____________________________");
		System.out.println("********* Used Bean Alias Name in <alias> tag ********\n");
		Details d6=factory.getBean("alias3", Details.class);
		System.out.println(d6);
		
		System.out.println("\n\n ____________________________");
		Details d7=factory.getBean("alias4", Details.class);
		System.out.println(d7);
		
		
	}//main
	
}//class
