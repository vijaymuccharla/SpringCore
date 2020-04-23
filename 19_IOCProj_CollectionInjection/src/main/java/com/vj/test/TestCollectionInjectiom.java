package com.vj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.vj.beans.ArrayOfValues;
import com.vj.beans.ListCollectionValues;
import com.vj.beans.MapCollectionValues;
import com.vj.beans.PropertiesValues;
import com.vj.beans.SetCollectionValues;

public class TestCollectionInjectiom {

	public static void main(String[] args) {
		BeanFactory factory=null;
		ArrayOfValues a=null;
		
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/vj/cfgs/applicationContext.xml"));

		a=factory.getBean("array",ArrayOfValues.class);
		System.out.println("Array values using Setter injection");
		System.out.println("Obvoiusly, duplicates are allowed!!!!!");
		System.out.println(a);

		System.out.println("\n\n*********************************************");

		ListCollectionValues l=factory.getBean("list", ListCollectionValues.class);
		System.out.println("List Genericvalues using Setter injection");
		System.out.println("Here as well, duplicates are allowed!!!!!");
		System.out.println(l);

		System.out.println("\n\n*********************************************");

		SetCollectionValues set=factory.getBean("set", SetCollectionValues.class);
		System.out.println("Set Genericvalues using Setter injection");
		System.out.println("Nope , duplicates are NOT allowed!!!!!");
		System.out.println(set);

		System.out.println("\n\n*********************************************");

		MapCollectionValues map=factory.getBean("map", MapCollectionValues.class);
		System.out.println("Map Genericvalues using Setter injection");
		System.out.println("Duplicate objects with data allowed!! but, duplicate KEYS are NOT allowed!!!!! \n ****the duplicate key DATA is replaced with new given data***");
		System.out.println(map);

		System.out.println("\n\n*********************************************");
		
		PropertiesValues pr=factory.getBean("props", PropertiesValues.class);
		System.out.println("Duplicate objects with data allowed!! but, duplicate KEYS are NOT allowed!!!!! \n ****the duplicate key DATA is replaced with new given data***");
		System.out.println(pr);
		
	}//main


}//class
