package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	int id ;
	String name ;
	double marks ;
	
	public Student(@Value("1") int id ,@Value("Major Mohit Sharma") String name ,@Value("98.56") double marks) {
		this.id = id ;
		this.name = name ;
		this.marks = marks ;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
