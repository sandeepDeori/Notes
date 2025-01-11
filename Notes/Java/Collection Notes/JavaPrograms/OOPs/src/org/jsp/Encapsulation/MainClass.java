package org.jsp.Encapsulation;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee() ;
		e1.setId(1) ;
		e1.setName("Major Mukund ") ;
		e1.setSalary(935874.15) ;
		
		System.out.println(e1.getId() ) ;
		System.out.println(e1.getSalary() ) ;
	}
}
