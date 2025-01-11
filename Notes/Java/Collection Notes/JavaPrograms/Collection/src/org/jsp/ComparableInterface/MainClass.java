package org.jsp.ComparableInterface;

import java.util.TreeSet;


public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee(1 , "Major Vivek" , "Major" , 96500.48) ;
		Employee e2 = new Employee(2 , "Captain Vikram" , "Captain" , 90500.25) ;
		Employee e3 = new Employee(3 , "Flying Officer Karthik" , "Flying Officer" , 92247.26) ;
		Employee e4 = new Employee(4 , "Brigadier Saurabh" , "Brigadier" , 982547.21) ;
		
		TreeSet<Employee> ts = new TreeSet<>() ;
		ts.add(e2) ;
		ts.add(e1) ;
		ts.add(e4) ;
		ts.add(e3) ;
		
		for(Employee e : ts)
		System.out.println(e) ;
	}
}
