package com.vj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vj.bean.Details;

public class BeanScopeTest {

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
//		_____________________________________________
//	Check applicationContext for more details**
		
		System.out.println("\n\n ____________________________");
		Details d2=factory.getBean("info2", Details.class);
		System.out.println(d2);
		
		System.out.println("\n\n ____________________________");
		Details d3=factory.getBean("info2", Details.class);
		System.out.println(d3);
		
		System.out.println("BeanScope of info2 is set to Prototype!");
		System.out.println("d2==d3 ? "+(d2==d3));
		System.out.println(d2.hashCode()+"----"+d3.hashCode());
		
//		______________________________________________
		
		
		System.out.println("\n\n ____________________________");
		Details d4=factory.getBean("info3", Details.class);
		System.out.println(d4);
		
		System.out.println("\n\n ____________________________");
		Details d5=factory.getBean("info3", Details.class);
		System.out.println(d5);
		
		System.out.println("BeanScope of info3 is set to Singleton!");
		System.out.println("d4==d5 ? "+(d4==d5));
		System.out.println(d4.hashCode()+"----"+d5.hashCode());
		
		
	}//main
	
}//class
