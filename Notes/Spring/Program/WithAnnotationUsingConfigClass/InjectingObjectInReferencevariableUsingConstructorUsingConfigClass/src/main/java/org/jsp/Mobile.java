package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	Battery battery ;
	
	@Autowired
	public Mobile(Battery battery) {
		this.battery = battery ;
	}
	
	public void display() {
		System.out.println("Mobile is running") ;
		battery.run() ;
	}
}
