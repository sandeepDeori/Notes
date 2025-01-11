package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	Battery battery ;
	
	public void run() {
		System.out.println("I am mobile") ;
		battery.display() ;
	}
	

	
}
