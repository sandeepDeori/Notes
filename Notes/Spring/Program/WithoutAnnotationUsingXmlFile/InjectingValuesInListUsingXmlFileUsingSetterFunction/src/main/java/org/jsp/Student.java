package org.jsp;

import java.util.List;

public class Student {

	int id ;
	String name ;
	List<String> subjects ;
	
	public void setId(int id) {
		this.id = id ;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects ;
	}
}
