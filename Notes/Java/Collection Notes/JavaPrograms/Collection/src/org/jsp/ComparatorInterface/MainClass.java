package org.jsp.ComparatorInterface;

import java.util.Set;
import java.util.TreeSet;

import org.jsp.ComparatorInterface.Employee;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee(1 , "Major Harshan Nair" , 105000.25 , "9ParaSF") ;
		Employee e2 = new Employee(2 , "Captain Vikram Batra" , 90500.69 , "1ParaSf") ;
		Employee e3 = new Employee(3 , "Brigadier Saurabh Sikhawat" , 180000.38 , "21ParaSf") ;
		Employee e4 = new Employee(4 , "General Bipin Rawat" , 250000.85 , "GorkhaRifles") ;
			
		TreeSet<Employee> ts1 = new TreeSet<>() ;  //here by default comparable interface is used for sorting in that id attribute is used
		ts1.add(e4) ;
		ts1.add(e2) ;
		ts1.add(e1) ;
		ts1.add(e3) ;
		
		System.out.println("On the basis of id") ;
		System.out.println(ts1) ;
		
		NameComparator nameComp = new NameComparator() ;
		Set<Employee> s = new TreeSet<>(nameComp) ;  //here nameComparator is used for sorting
		
		s.add(e4) ;
		s.add(e1) ;
		s.add(e2) ;
		
		s.add(e3) ;
		
		System.out.println("\n On the basis of name") ;
		System.out.println(s) ;
		
		SalaryComparator salComp = new SalaryComparator() ;
		TreeSet<Employee> ts2  = new TreeSet<>(salComp) ;  //here salaryComparator is used for sorting
		
		ts2.add(e4) ;
		ts2.add(e2) ;
		ts2.add(e3) ;
		ts2.add(e1) ;
		
		System.out.println("\n On the basis of salary") ;
		System.out.println(ts2) ;
		
		
		
		
	}
}
