package org.jsp.ComparatorInterface;

public class Employee implements Comparable<Employee>{

	int id ;
	String name ;
	double salary ;
	String dept ;
	
	Employee(int id , String name , double salary , String dept){
		this.id = id ;
		this.name = name ;
		this.salary = salary ;
		this.dept = dept ;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	public int compareTo(Employee e) {
		return this.id - e.id ;
	}
	
}
