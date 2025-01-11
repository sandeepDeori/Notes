package org.jsp.Queue;

public class Employee implements Comparable{

	int id ;
	String name ;
	double salary ;
	String department ;
	
	Employee(int id , String name , double salary , String department){
		this.id = id ;
		this.name = name ;
		this.salary = salary ;
		this.department = department ;
	}
	
	public int compareTo(Object e) {
		Employee emp= (Employee) e ;
		return this.id - emp.id ;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	
}
