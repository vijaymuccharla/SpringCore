package in.vijay.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import in.vijay.comps.One;
import in.vijay.comps.Two;

public class TestCyclicInjectionSetterVsConstructorInject {

	public static void main(String[] args) {
		
		//create ICO container
		BeanFactory ioc=new XmlBeanFactory(new ClassPathResource("in/vijay/cfgs/applicationContext.xml"));
		//get bean object
		
		
		//here it will work fine cause, target and dependent both are ready to be injected in their respective 
		// Setter and Constructor dependents
		One one=ioc.getBean("o1", One.class);
		System.out.println(one);
//		 				*/
		
		/*
		 
		//here it gives dead loack cause dependetn object is not available to create object of Target, so cyclic error.
		Two two=ioc.getBean("t1", Two.class;
		System.out.println(two);
		 	//			*/
	}
	
	
}
