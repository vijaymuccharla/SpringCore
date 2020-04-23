package com.vj.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.vj.singletons.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/vj/cfgs/applicationContext.xml");
		/*
		BeanScopes :
		Mainly Singleton and Prototype :: Check Spring Bean cfg file***
		
		1. By default all beans are taken as SINGLETON BEANSCOPE by IOC.
		2. We can use Singleton BeanScope on normal bean classes to inform
		container, take them as Singletons and allow only one instantiation.
		3. We use Prototype BeanScope on beans to inform that they can be 
		instantiated multiple times.
		Q) What happens if we use Prototype BeanScope on a Singleton?
		a) It means that we are informing container to take it as Prototype 
		even though it is a singleton class. So Container will allow creating 
		multiple objects using Reflection API internally to access 
		Private Contructors.  
		
		*/
		
		Printer p1=factory.getBean("print", Printer.class);
		Printer p2=factory.getBean("print", Printer.class);
		
		System.out.println("p1==p2? "+(p1==p2));
		System.out.println(p1.hashCode()+ "----"+p2.hashCode());
		
	}
	
}
