package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	Engine engine ;
	

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine ;
	}
	
	public void display() {
		System.out.println("car is running") ;
		engine.run() ;
	}
	
}
