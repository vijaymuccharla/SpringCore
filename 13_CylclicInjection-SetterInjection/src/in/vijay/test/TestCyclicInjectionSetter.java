package in.vijay.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import in.vijay.comps.One;
import in.vijay.comps.Two;

public class TestCyclicInjectionSetter {

	public static void main(String[] args) {
		
		//create ICO container
		BeanFactory ioc=new XmlBeanFactory(new ClassPathResource("in/vijay/cfgs/applicationContext.xml"));
		//get bean object
		
		
//		One one=ioc.getBean("o1", One.class);
				
//		System.out.println(one);
		
		Two two=ioc.getBean("t1", Two.class);
		
		System.out.println(two);
		
	}
	
	
}
