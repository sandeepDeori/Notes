package org.jsp.InheritencethisCallingStatement;

public class MainClass {

	public static void main(String[] args) {
		Employee e = new Employee(1 , "9ParaSf" , 102005.56 ,"Major Arun" ,35 ,6.2 , 12.23) ;
		
		System.out.println(e.id) ;
		System.out.println(e.yoe) ;
		System.out.println(e.name) ;
	}
}
