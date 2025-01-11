package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	Engine engine ;
	
	public void run() {
		System.out.println("Car is running") ;
		engine.display();
	}
}
