package com.vijay.prog;

public class SportsCar implements Car {

	@Override
	public void assemble() {
		
		System.out.println("SportsCar.assemble() done, no mileage, more safety, funky");
		
	}

	@Override
	public void painting() {
		
		System.out.println("SportsCar.painting() done");
		
	}

	@Override
	public void roadTest() {
		
		System.out.println("SportsCar.roadTest() done");

	}

}
