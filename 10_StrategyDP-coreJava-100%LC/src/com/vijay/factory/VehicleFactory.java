package com.vijay.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.vijay.comps.Engine;
import com.vijay.comps.Vehicle;

public class VehicleFactory {

	private static Vehicle vehicle;
	private static Engine engine;
	
	static {
		System.out.println("VehicleFactory-- static block");
		try {
		Properties p=null;
		InputStream is=null;
		
		//localte the properties file
		is=new FileInputStream("src/com/vijay/commons/app.properties");
		//load the data into props
		p=new Properties();
		p.load(is);
		
		//get the targets and dependents
		engine=(Engine)Class.forName(p.getProperty("dependent.class")).newInstance();
		vehicle=(Vehicle)Class.forName(p.getProperty("target.class")).newInstance();
		}
		catch (InstantiationException iae) {
			iae.printStackTrace();
		}
		catch (ClassNotFoundException cnf) {
			System.out.println("Invalid dependent/target");
			cnf.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public static Vehicle getInstance() {
		//set dependent to target
		vehicle.setEngine(engine);
		return vehicle;
	}
	
	/*
	public static Vehicle getInstance(String type) {
	Vehicle vehicle=null;
	Engine engine=null;
		if(type.equalsIgnoreCase("diesel")) {
			engine=new DieselEngine();
			vehicle=new Vehicle().setEngine(engine);
			
		}
		else if(type.equalsIgnoreCase("petrol")) {
			engine=new PetrolEngine();
			vehicle=new Vehicle().setEngine(engine);
		}
		else {
			throw new IllegalArgumentException("Invali Engine Type");
		}
		return vehicle;
	}
	*/	
	
}
