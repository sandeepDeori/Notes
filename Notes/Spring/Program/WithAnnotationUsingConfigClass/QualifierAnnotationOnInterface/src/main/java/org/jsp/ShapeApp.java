package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeApp {

	@Qualifier(value="triangle")
	@Autowired
	Shape shape ;
	
	public void display() {
		System.out.println("ShapeApp") ;
		shape.print() ;
	}
}
