package org.jsp.Set;

import java.util.HashSet;

public class StoringWrapperClassAndStringObjectInHashSet {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet() ;
		
		hs.add(45) ;
		hs.add("Major Mohit Sharma") ;
		hs.add(true) ;
		hs.add(4.5) ;
		hs.add('C') ;
		
		
		for(Object o : hs) {
			System.out.println(o) ;
		}
		
	}
}
