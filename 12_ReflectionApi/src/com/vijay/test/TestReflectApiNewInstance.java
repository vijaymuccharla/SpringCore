package com.vijay.test;

import java.lang.reflect.Constructor;

import com.vijay.one.Student;

public class TestReflectApiNewInstance {

	public static void main(String[] args) {
		//get the constructors 
		Constructor cons[]=null;
		Class c=null;
		Student s1=null,s2=null;
		
		try {
			
				c=Class.forName("com.vijay.one.Student");
				cons=c.getDeclaredConstructors();

				System.out.println(cons[0]);
				System.out.println(cons[1]);
				

				cons[0].setAccessible(true);
				cons[1].setAccessible(true);
				
//				JVM creates the objects of specific class constructor based on the order of declaration.
//					So we have to change index as per the constructor declarations
				
				s1=(Student)cons[1].newInstance();
				s1=(Student)cons[0].newInstance(10,20);
				
				System.out.println(s1);
				System.out.println(s2);
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	
}
