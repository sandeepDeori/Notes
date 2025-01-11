package org.jsp.MethodOverloading;

public class MainClass {

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading() ;
		System.out.println(m.sum(1, 2) ) ;
		System.out.println(m.sum(5,7 ,6) ) ;
		System.out.println(m.sum(10,20,30,40) ) ;
		
	}
}
