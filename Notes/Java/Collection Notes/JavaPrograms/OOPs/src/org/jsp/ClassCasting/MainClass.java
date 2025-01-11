package org.jsp.ClassCasting;

public class MainClass {

	public static void main(String[] args) {
		
		Person e = new Employee(1 , "ParaSf" , 58000 , "Major Arun" , 35 , 5.98) ; //upcasting
		e.run() ;
		//e.fly() ; // cannot access as it is sub-class property and object upcasted to super-class type
		System.out.println(e.name) ;
		//System.out.println(e.id) ; // because it is sub-class property so object is upcasted to super-class type
		
		
		Employee e1 = (Employee) e ; //downcasting
		e1.fly() ;
		System.out.println(e1.id) ; 
		
		e1.walk() ; 
		System.out.println(e1.name) ;
		
		
		
	}
}
