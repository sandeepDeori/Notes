package org.jsp;

public class Employee {

	int id ;
	String name ;
	double salary ;
	String desg ;
	
	public Employee(int id , String name , double salary , String desg) {
		this.id = id ;
		this.name = name ;
		this.salary = salary ;
		this.desg = desg ;
	}
	
	public String toString() {
	 return "id="+this.id+" name="+this.name+" salary="+this.name+" desg="+this.desg ;
	}
	
	
	public static int num = 1 ;  //So that for every object num will be different as it belongs to class not to any object 
	public int hashCode() {
		return num++ ;
	}
	
	public boolean equals(Object args) {
		return this.hashCode() ==  args.hashCode() ;
	}
	
	
}
