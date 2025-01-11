package org.jsp.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainClass {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>() ;
		
		al.add(45) ;
		al.add(60) ;
		al.add(25) ;
		al.add(58) ;
		
		ListIterator itr = al.listIterator() ;
		
		while(itr.hasNext()) {
			boolean b = itr.hasNext() ;
			System.out.println(b) ;
			itr.next();
//			itr.remove() ;	
		}
		
		System.out.println() ;
		while(itr.hasPrevious()) {
			Integer i = (Integer)itr.previous()  ;
			System.out.println(i) ;
		}
	}
}
