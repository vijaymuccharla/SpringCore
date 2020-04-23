package com.vijay.comps;

public final class PetrolEngine implements Engine {

	private PetrolEngine() {
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
