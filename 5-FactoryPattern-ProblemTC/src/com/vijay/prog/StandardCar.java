package com.vijay.prog;

public class StandardCar implements Car {

	@Override
	public void assemble() {
		
		System.out.println("StandardCar.assemble() done, more mileage, less safety");
		
	}

	@Override
	public void painting() {
		
		System.out.println("StandardCar.painting() done");
		
	}

	@Override
	public void roadTest() {
		
		System.out.println("StandardCar.roadTest() done");

	}

}
