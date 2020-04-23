package com.vj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vj.beans.MobilePhone;

public class DependencyLookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MobilePhone phone=null;
	//create IOC container
		System.out.println("1st IOC container");
		factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/vj/cfgs/applicationContext.xml");
		 //get Target bean class object
		 phone=factory.getBean("phone",MobilePhone.class);
		 System.out.println(".........................................");
		 //invoke methods
		 phone.calls();
		 phone.gaming();
		 phone.shopping();
		 phone.entertainment();
			System.out.println("\n\n");
		 phone.batteryCharging(factory, "charger");
		
		
		
	}

}
