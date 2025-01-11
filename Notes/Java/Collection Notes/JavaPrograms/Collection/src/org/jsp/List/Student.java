package org.jsp.List;

public class Student {

	int id ;
	String name ;
	double marks ;
	String college ;
	
	public Student(int id , String name , double marks , String college) {
		this.id = id ;
		this.name = name ;
		this.marks = marks ;
		this.college = college ;
		
	}
	
	public String toString() {
		return this.name+"\t"+this.id+"\t"+this.marks+"\t"+this.college ;
	}
}
