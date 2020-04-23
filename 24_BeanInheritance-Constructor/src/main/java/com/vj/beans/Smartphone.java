package com.vj.beans;

public class Smartphone {

	private String manufacturer;
	private String model;
	private String operatingSystem;
	private String color;
	private String processor;
	private String storageCapacity;
	private String memory;
	private int cameras;
	
	
	public Smartphone(String manufacturer, String model, String operatingSystem, String color, String processor,
			String storageCapacity, String memory, int cameras) {
		System.out.println("Smartphone: 8-param constructor");
		this.manufacturer = manufacturer;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.color = color;
		this.processor = processor;
		this.storageCapacity = storageCapacity;
		this.memory = memory;
		this.cameras = cameras;
	}

	@Override
	public String toString() {
		return "Smartphone [manufacturer=" + manufacturer + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", color=" + color + ", processor=" + processor + ", storageCapacity=" + storageCapacity + ", memory="
				+ memory + ", cameras=" + cameras + "]";
	}

}
