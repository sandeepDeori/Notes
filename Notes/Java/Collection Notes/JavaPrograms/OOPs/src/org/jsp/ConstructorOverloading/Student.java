package org.jsp.ConstructorOverloading;

public class Student {

	int id  ;
	String name ;
	double marks ;
	
	public Student() {
		this.id = 0 ;
	    this.name = null ;
	    this.marks = 0.0 ;
	}
	
	public Student(int id , String name, double marks) {
		this.id = id ;
		this.name = name ;
		this.marks = marks ;
	}
	
	public String toString() {
		return "id = "+this.id+" name = "+this.name+" marks = +"+this.marks ;
	}
}
