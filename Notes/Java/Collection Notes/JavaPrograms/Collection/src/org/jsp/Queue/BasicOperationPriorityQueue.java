package org.jsp.Queue;

import java.util.PriorityQueue;

public class BasicOperationPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue() ;
		
		pq.offer(45) ;
		pq.add(1) ;
		pq.add(100) ;
		pq.add(9) ;

		
		PriorityQueue pq1 = new PriorityQueue() ;
		
		Employee e1 = new Employee(1 , "Major Harshan" , 95260.25 , "9ParaSf") ;
		Employee e2 = new Employee(2 , "Major Vivek" , 125648.24 , "1ParaSf") ;
		Employee e3 = new Employee(3 , "Captain Tushar" , 1485236.24 , "21ParaSf") ;
		Employee e4 = new Employee(4, "Captain Pawan" , 1475236.85 , "1ParaSf") ;
		
		pq1.add("Major") ;
		pq1.offer("Aajor") ;
		pq1.offer("Cajor") ;
		pq1.offer("Dtjor") ;
		
		
        while(!pq1.isEmpty()) {
        	Object p = pq1.poll() ;
        	System.out.println(p) ;
        }
//		Object o = pq.peek() ;
//		System.out.println("viewing head element " + o) ;
//		
//		
//		System.out.println("removing all elements from priority queue") ;
//		Object ele = pq.poll() ;
//		 
//		while(ele!=null) {
//			System.out.println(ele) ;
//			ele = pq.poll() ;
//		}
		
	}
}
