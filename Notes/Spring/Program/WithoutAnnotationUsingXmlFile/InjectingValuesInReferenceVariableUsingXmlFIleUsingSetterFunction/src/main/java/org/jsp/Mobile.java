package org.jsp;

public class Mobile {

	Battery battery ;
	
	public void run() {
		System.out.println("i am mobile") ;
		battery.display();
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery ;
	}
}
