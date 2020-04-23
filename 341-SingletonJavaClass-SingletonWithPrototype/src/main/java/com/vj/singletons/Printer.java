package com.vj.singletons;

public class Printer {

	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer.Printer()");
	}
	public static Printer getInstance() {
		if(INSTANCE==null) {
			INSTANCE=new Printer();
		}
	return INSTANCE;
	}
	
}
