package org.jsp.ComparableInterface;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

	    int id ;
		String name ;
	    String rank ;
	    double salary ;
	    
		public Employee(int id, String name, String rank, double salary) {
			this.id = id;
			this.name = name;
			this.rank = rank;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employees [id=" + id + ", name=" + name + ", rank=" + rank + ", salary=" + salary + "]";
		}
	    
		public int compareTo(Employee o) {
			return o.id - this.id ;
		}
		
		
	    
		
	}

