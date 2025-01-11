package org.jsp.Set;

import java.util.HashSet;

public class StoringUserDefinedObjectsInHashSet {
 
	public static void main(String[] args) {
		
		Student s1 = new Student(1 , "MajorArun" , 93.25 , "IMA") ;
		Student s2 = new Student(2 , "MajorVivek" , 94.69 , "NDA") ;
		
		HashSet<Student> hs = new HashSet<>() ;
		
		hs.add(s1) ;
		hs.add(s2) ;
		
		
		for(Student s : hs) {
			System.out.println(s) ;
		}
		
		
		System.out.println(s2.equals(s1)) ;
	}
}
