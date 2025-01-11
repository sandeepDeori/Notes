package org.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Person {

	@Autowired
	Mobile mobile ;
	
	public void display() {
		System.out.println("I am Person") ;
		mobile.ring() ;
	}
	
}
