package org.jsp.InheritenceExplicitCallingStatement;

public class Employee extends Person{

	public int id ;
	
	public double salary  ;
	
	Employee(int id , double salary , String name , double height , String birthPlace){
	super(name , birthPlace , height) ;
	this.id = id ;
	this.salary = salary ;
	}
}
