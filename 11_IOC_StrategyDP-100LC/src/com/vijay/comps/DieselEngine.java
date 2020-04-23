package com.vijay.comps;

public final class DieselEngine implements Engine {

	private DieselEngine() {
		System.out.println("DieselEngine: 0-param constructor");
	}
	@Override
	public void start() {
		System.out.println("DieselEngine.start() :: engine started");
	}
	@Override
	public void stop() {
		System.out.println("DieselEngine.stop()::  engine stopped");
	}
}
