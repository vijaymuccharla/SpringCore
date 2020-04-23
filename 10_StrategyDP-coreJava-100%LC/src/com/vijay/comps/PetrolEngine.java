package com.vijay.comps;

public class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine : 0-pram constructor");
	}
	@Override
	public void start() {
		System.out.println("PetrolEngine.start() :: engine started");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop() :: engine stopped");
	}
}
