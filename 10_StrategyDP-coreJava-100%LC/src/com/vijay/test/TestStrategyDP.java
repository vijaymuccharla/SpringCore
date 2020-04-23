package com.vijay.test;

import com.vijay.comps.Vehicle;
import com.vijay.factory.VehicleFactory;

public class TestStrategyDP {

	public static void main(String[] args) {
		
		Vehicle vehicle=VehicleFactory.getInstance();
		vehicle.trip("Hyderabd", "Goa");
	}
}
