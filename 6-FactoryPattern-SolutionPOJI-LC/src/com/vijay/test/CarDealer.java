package com.vijay.test;

import com.vijay.factory.CarFactory;
import com.vijay.prog.Car;

public class CarDealer {

	public static void main(String[] args) {
		Car car1=null,car2=null,car3=null;
		car1= CarFactory.getInstance("standard");
		car2= CarFactory.getInstance("luxury");
		car3= CarFactory.getInstance("sports");
		
	}

}
