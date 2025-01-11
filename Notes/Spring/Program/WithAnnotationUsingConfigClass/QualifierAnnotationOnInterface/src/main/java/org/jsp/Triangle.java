package org.jsp;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	public void print() {
		System.out.println("Triangle") ;
	}
}
