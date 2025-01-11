package org.jsp.Encapsulation;

public class Employee {

	private int id ;
	
	private String name ;
	
	private double salary ;
	
	public int getId() {
		return id ;
	}
	
	public String getName() {
		return name ;
	}
	
	public double getSalary() {
		return salary ;
	}
	
	public void setId(int id ) {
		this.id = id ; 
	}
	
	public void setName(String name) {
		this.name = name ;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary ;
	}
	
	public Employee(int id , String name , double salary) {
		this.id = id ;
		this.name = name ;
		this.salary = salary ;
	}
	
	public Employee() {
		this.id = 0 ;
		this.name= null ;
		this.salary = 0.0 ;
	}
}
