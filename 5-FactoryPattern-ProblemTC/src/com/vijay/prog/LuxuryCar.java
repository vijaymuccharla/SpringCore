package com.vijay.prog;

public class LuxuryCar implements Car {

	@Override
	public void assemble() {
		System.out.println("LuxuryCar.assemble() done, less mileage, more safety, costly");
	}

	@Override
	public void painting() {
		System.out.println("LuxuryCar.painting() done");
	}

	@Override
	public void roadTest() {
		System.out.println("LuxuryCar.roadTest() done");
	}

}
