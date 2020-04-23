package com.vijay.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vijay.beans.Myntra;

public class TestMyntraLC {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		//hold the spring cnfg file path
		res=new ClassPathResource("com/vijay/cfgs/applicationContext.xml");
		//create IOC branfactory container
		factory=new XmlBeanFactory(res);
		//create target class object using the bean id of Dependent
		Myntra myntra=factory.getBean("myntra",Myntra.class);
		//invoke b logic mehtod
		String invoice=myntra.order(
				new String[] {"IPhone-11","Bose Comfort 2 headphones","MacBook pro"},
				new double[] {125000.0,28000.0,97500.0} );
		System.out.println(invoice);
	}//main
}//class
