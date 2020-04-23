package com.cj.beans;

public class Smartphone {

	private String manufacturer;
	private String model;
	private String operatingSystem;
	private String color;
	private String processor;
	private String storageCapacity;
	private String memory;
	private int cameras;
	
	public Smartphone() {
		System.out.println("Smartphone :: 0-Param constructor");
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(String storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public int getCameras() {
		return cameras;
	}

	public void setCameras(int cameras) {
		this.cameras = cameras;
	}

	@Override
	public String toString() {
		return "Smartphone [manufacturer=" + manufacturer + ", model=" + model + ", operatingSystem=" + operatingSystem
				+ ", color=" + color + ", processor=" + processor + ", storageCapacity=" + storageCapacity + ", memory="
				+ memory + ", cameras=" + cameras + "]";
	}

}
