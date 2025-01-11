package org.jsp.ClassCasting;

public class Person {

	String name ;
	int age ;
	double height ;
	
	public Person(String name , int age , double height) {
		this.name = name ;
		this.age = age ;
		this.height = height ;
	}
	
	void walk() {
		System.out.println("walk") ;
	}
	
	void run() {
		System.out.println("run") ;
	}
}
