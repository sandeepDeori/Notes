package org.jsp;

import java.util.Map;

public class Student {

	int id ;
	String name ;
	Map<String,Double> marks ;
	
	public void setId(int id) {
		this.id = id ;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public void setMarks(Map<String,Double> marks) {
		this.marks = marks ;
	}
	
}
