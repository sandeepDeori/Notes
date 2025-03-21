package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id ;
	private String name ;
	private double marks ;
	
	@Value("1")
	public void setId(int id ) {
		this.id = id ;
	}
	
	@Value("Sandeep")
	public void setName(String name) {
		this.name = name ;
	}
	
	@Value("95.6")
	public void setMarks(double marks) {
		this.marks = marks ;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
