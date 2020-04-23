package com.vj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vj.beans.EngineeringSubjects;

public class EnggSubjectCollectionMergeTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		//get IOC Container
		factory= new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vj/cfgs/applicationContext.xml");
		
		//get beansXj
		EngineeringSubjects subs=factory.getBean("enggSubjs",EngineeringSubjects.class);
		System.out.println(subs);
		/*
		Collection TAG Type Merge has 3 values, and it WILL override <bean> tag default-merge atttribute values
		1.Default		- It if false by default
		2.False			- Disable
		3.True				- Enable
		
		<beans> tag default-merge attribute has 3 values, CANNOT override collection tag merge attribute values
		1.Default		- It if false by default
		2.False			- Disable all
		3.True				- Enable	all
		
		
		*/
		
		
		
	}//main
	
}//class
