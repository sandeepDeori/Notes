package org.jsp.InheritencethisCallingStatement;

public class Employee extends Person{

	public int id ;
	
	public String dept ;
	
	public double salary ;
	
	public double yoe ;
	
	public Employee(double yoe , String name , int age , double height )
	{	
		super(name , age , height) ;
		this.yoe = yoe ;	
	}
	
	
	public Employee(int id , String dept , double salary, String name , int age , double height , double yoe) {
		   this(yoe, name, age , height) ;
	       this.id = id ;
	       this.dept = dept ;
	       this.salary = salary ; 
	}
}
