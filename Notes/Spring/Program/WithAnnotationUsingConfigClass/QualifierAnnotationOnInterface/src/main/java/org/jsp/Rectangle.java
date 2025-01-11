package org.jsp;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{

	public void print() {
		System.out.println("Rectangle") ;
	}
}
