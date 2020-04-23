package com.vijay.test;

import java.io.InputStream;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vijay.comps.Vehicle;

public class TestStrategyDP {

	public static void main(String[] args) {
		Resource res=null;
		InputStream is=null;
		BeanFactory factory=null;
		//create IOC
	factory=new XmlBeanFactory(new ClassPathResource("com/vijay/cfgs/applicationContext.xml"));
	//get bean object
	Vehicle v=factory.getBean("veh", Vehicle.class);
	//invoke b.logic
	v.trip("HYD" , "GOA");
		
	}
}
