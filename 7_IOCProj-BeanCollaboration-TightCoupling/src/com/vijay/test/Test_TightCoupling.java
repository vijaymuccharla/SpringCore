package com.vijay.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vijay.beans.Flipkart;

/*
In order to work with Bluedart courier we have to change source code in Flipkart 
which is complex everytime we need to change the courier servcie.
*/
public class Test_TightCoupling {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		Flipkart fk=null;
		//hold the cfg file path
		res=new ClassPathResource("com/vijay/cfgs/applicationContext.xml");
		//create IOC Bean factory container
		factory=new XmlBeanFactory(res);
		//get bean object
		fk=factory.getBean("fpkt", Flipkart.class);
		//invoke business logic
		System.out.println(fk.shopping(new String[] {"Iphone","charger","Watch","Headphones"},new double[] {98000.0,4500.0,25000.0,18500.0}));

	}

}
