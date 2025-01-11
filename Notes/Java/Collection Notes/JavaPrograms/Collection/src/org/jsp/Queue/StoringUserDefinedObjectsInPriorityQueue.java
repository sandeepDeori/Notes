package org.jsp.Queue;

import java.util.PriorityQueue;

public class StoringUserDefinedObjectsInPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Employee> pq = new PriorityQueue<>() ;
		
		Employee e1 = new Employee(1 , "Major Harshan" , 4125896.25 , "9ParaSf") ;
		Employee e2 = new Employee(2 , "Major Vivek Jacob" , 8756932.15 , "1ParaSf") ;
		Employee e3 = new Employee(3 , "Captain Vikram Batra" , 4523697.48 , "Gorkha Rifles") ;
		Employee e4 = new Employee(4 , "Captain Manoj Pandey" , 4521369.85 , "Granediers") ;
		
		
		pq.offer(e2) ;
		pq.offer(e1) ;
		pq.offer(e4) ;
		pq.offer(e3) ;
		
		if(e1 instanceof Employee) {
			System.out.println("Yes") ;
		}
		else {
			System.out.println("No") ;
		}
		
		Employee e = pq.poll() ;
		
		while(e!=null) {
			System.out.println(e) ;
			e = pq.poll() ;
		}
	}
}
