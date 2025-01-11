package org.jsp.ComparatorInterface;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	public int compare(Employee emp1 , Employee emp2) {
		Double d1 = emp1.salary ;
		Double d2 = emp2.salary ;
		
		return d1.compareTo(d2) ;
	}
}
