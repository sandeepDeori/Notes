package org.jsp.List;


import java.util.ArrayList;

public class CreatingArrayListAndBasicOperation {

	public static void main(String[] args) {
	
		ArrayList al1 = new ArrayList() ; // size is 0, capacity is 10
		
		ArrayList al2 = new ArrayList(50) ; // size is 0, capacity is 50 
		
	
		
		ArrayList al3 = new ArrayList() ;
		al3.add(25) ;
		al3.add(30) ;
		
		al3.add("test") ;
		
		
		
		System.out.println(al3.get(2)) ;
		
		System.out.println(al3.isEmpty()) ;
		System.out.println(al3.remove(2)) ;
		System.out.println(al3.size()) ;
		System.out.println("printing arrylist al3 " +al3) ;
	
       System.out.println( (int)al3.get(0) + (int)al3.get(1)  ) ; //downcast and then adding elements
        al1.add(10) ;
        al1.add("Major Vivek") ;
        al1.add(false) ;
        al1.add(4.52) ;
        al1.add('S') ;
        
		al1.add(1,"Major Arun") ;
		System.out.println(al1) ;
		
	
		
		System.out.println(al1.set(1,"Major Harshan") ) ; //set will return element which was removed
		
     	System.out.println(al1) ;
		
		
		String s = ((String)al1.get(1)).toUpperCase() ; //downCasting from object class type to String class object type
		
		System.out.println(s) ;
		
		for(int i=0 ; i<=al1.size()-1 ; i++)
		System.out.print(al1.get(i) + "   ") ;
		
		System.out.println() ;
		for(Object ele : al1) {
			System.out.print(ele + "  ") ;
		}
		
		System.out.println() ;
		System.out.println(al1.remove(al1.get( al1.size()-1) )  ); // last index element removed  , return element which was removed
		
		System.out.println(al1) ;
		
		System.out.println() ;
		
		System.out.println( al1.remove( (Object) "Major Vivek") ) ; //return true if element removed successfully
		
		System.out.println(al1) ;
		
	}
}
