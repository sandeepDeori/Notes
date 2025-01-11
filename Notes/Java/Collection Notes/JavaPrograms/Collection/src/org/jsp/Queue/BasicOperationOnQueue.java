package org.jsp.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class BasicOperationOnQueue {

	public static void main(String[] args) {
		Queue q = new ArrayDeque() ;  //ArrayDeque follow order of insertion
		
		q.add(45) ;
		q.add(12) ;
		q.add(25) ;
		q.add(6) ;
		q.add(15) ;
		q.add(12) ;
		
	

//	   System.out.println(q.peek() ) ;
	  
	   
	    
	  Object ele = q.poll() ;
	  Integer e = (Integer) ele ;
	  
	    while(e != null) {
		  System.out.println(e) ;
		  e = (Integer) q.poll()  ;
	    }
  }
	
}
