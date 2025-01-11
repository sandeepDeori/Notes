package org.jsp.ClassCasting;

public class Employee extends Person {

	int id  ;
	String dept ;
	double salary ;
	
	public Employee(int id , String dept , double salary , String name , int age , double height) {
		super(name ,age , height) ;
		this.id = id ;
		this.dept = dept ;
		this.name= name ;
	}
	
	public void fly() {
		System.out.println("fly") ;
	}
	
	
}
