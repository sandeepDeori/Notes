package org.jsp;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee(1 , "Major Tushar" , 96000 , "Major") ;
		Employee e2 = new Employee(2 , "Captain Pawan" , 80000 , "Captain") ;
		
		System.out.println(e1) ;
		System.out.println(e2) ;
		
		System.out.println(e1.equals(e2) ) ;
		
	}
}
