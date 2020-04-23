package com.vijay.factory;

import com.vijay.prog.Car;
import com.vijay.prog.LuxuryCar;
import com.vijay.prog.SportsCar;
import com.vijay.prog.StandardCar;

public class CarFactory {

	private static Car factory=null;
	
	public static Car getInstance(String car) {
		if(car.equalsIgnoreCase("standard")) {
		factory=new StandardCar();
		factory.assemble();
		factory.painting();
		factory.roadTest();
		}
		else if(car.equalsIgnoreCase("Sports")) {
			factory=new SportsCar();
			factory.assemble();
			factory.painting();
			factory.roadTest();
		}
		else if(car.equalsIgnoreCase("luxury")) {
			factory=new LuxuryCar();
			factory.assemble();
			factory.painting();
			factory.roadTest();
		}
		else {
			throw new IllegalArgumentException("This car  model is not Avaliable");
			
		}
		return factory;
		
	}
	
}
