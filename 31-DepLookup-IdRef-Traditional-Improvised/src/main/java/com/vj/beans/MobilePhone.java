package com.vj.beans;

import org.springframework.beans.factory.BeanFactory;

public class MobilePhone {
	private  String beanId;
	
	public void setBeanId(String beanId) {
		System.out.println("MobilePhone.setBeandId()");
		this.beanId = beanId;
	}

	public MobilePhone() {
		System.out.println("MobilePhone.MobilePhone()");
	}
	
 public   void gaming() {
	 System.out.println("MobilePhone.gaming()::: PubG,Ludo and etc..");
 }
 
 public void  shopping() {
	 System.out.println("MobilePhone.shopping()::: Amazon, Flipkart and etc..");
 }
 
 public  void entertainment() {
	 System.out.println("MobilePhone.entertainment():: Prime Vedio, netflix and etc..");
	 batteryLow();
 }
 
 private void batteryLow() {
	System.out.println("Battery Low, you might wanna plug in....");
	
}

public  void calls() {
	 System.out.println("MobilePhone.calls():: Incoming and outgoing calls");
 }
 
 public void batteryCharging(BeanFactory factory, String beanId) {

	 MobilePhoneBatteryCharger charger=null;

	 System.out.println("MobilePhone.batteryCharging()");
	
	 //get Depedent Bean class object
	 charger=factory.getBean(beanId,MobilePhoneBatteryCharger.class);
	 //invoke method
	 charger.charging();
	 
 }

}
