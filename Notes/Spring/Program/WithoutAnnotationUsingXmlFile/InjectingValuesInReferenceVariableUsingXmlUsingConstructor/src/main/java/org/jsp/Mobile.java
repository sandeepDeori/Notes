package org.jsp;

public class Mobile {

	Battery battery ;
	
	public void display() {
		System.out.println("Mobile is plugged into charger") ;
		battery.run() ;
	}
	
	public Mobile(Battery battery) {
		this.battery = battery ;
	}
	
	
}
