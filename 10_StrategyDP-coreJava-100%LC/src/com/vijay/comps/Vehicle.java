package com.vijay.comps;

public class Vehicle {
	private Engine engine;
	
	public Vehicle() {
		System.out.println("Vehicle :: 0-param constructor");
	}

	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void trip(String source, String dest) {
		engine.start();
		System.out.println("Trip started");
		engine.stop();
		System.out.println("Trip ended");
		
	}
}
