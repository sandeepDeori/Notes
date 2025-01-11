package org.jsp;

import org.springframework.stereotype.Component;

@Component
public class Student {

	
	int id ;
	String name ;
	double marks ;
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}
