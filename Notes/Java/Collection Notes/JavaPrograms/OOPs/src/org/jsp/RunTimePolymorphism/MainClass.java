package org.jsp.RunTimePolymorphism;

public class MainClass {

	public static void main(String[] args) {
		SelectAnimal s = new SelectAnimal() ;

	    s.select(new Dog() ) ;
	    s.select(new Cat() );
	    	
	}
}
