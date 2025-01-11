package org.jsp.ConstructorOverloading;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student() ;
		
		Student s2 = new Student(1 , "Major Mukund Varadrajan" , 96.32) ;
		
		System.out.println(s1) ;
		System.out.println(s2) ;
	}
}
