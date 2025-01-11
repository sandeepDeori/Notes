package org.jsp.InheritenceImplicitCallingStatement;

public class Employee extends Person{

	public int id ;
	
	public double salary ;
	
	public String department ;
	
	public Employee(int id , double salary , String department) {
		this.id = id ;
		this.salary = salary ;
		this.department = department ;
	}
}
