package org.jsp;

import java.util.Map;

public class Student {

	int id ;
	String name ;
	Map<Integer , String> subjects ;
	
	public Student(int id , String name , Map<Integer,String> subjects) {
		this.id = id ;
		this.name = name ;
		this.subjects = subjects ;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subjects=" + subjects + "]";
	}
	
	
}
