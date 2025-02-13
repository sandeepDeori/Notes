package org.jsp.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {
		
		// implementing abstract method i.e test of Predicate interface ...number is even or not
		Predicate<Integer> p = i -> i%2==0 ;
		
		
		//checking even numbers in the list
		List<Integer> list = Arrays.asList(2,3,4,5,6) ;
		for(int ele : list ) {
		 if(p.test(ele)) {
			 System.out.println(ele) ;
		 }
		}
		
		
	    // implementing test method of interface for checking string start with letter v
		Predicate<String> p1 = str -> str.toUpperCase().charAt(0) == 'V' ;
		
		// checking String start with Letter 'V' 
		List<String> list1 = Arrays.asList("VikramBatra" , "ShivenderKanwarLaL" , "varunKumar" , "TusharMahajanKal") ;
		
		for( String s : list1) {
			if(p1.test(s) ) {
				System.out.println(s) ;
			}
		}
		
		
		// solved same question using lambda
		List<String> listNameStartWithV= list1.stream().filter(p1).collect(Collectors.toList()) ;
		System.out.println(listNameStartWithV) ;
		
		
		//implementing test method of interface for checking string ends with letter l
		
	    Predicate<String> p2 = str -> str.toLowerCase().charAt(str.length()-1) == 'l' ;
		
         for(String str:list1) {
        	 if(p2.test(str)) {
        		 System.out.println(str) ;
        	 }
         }
         
         //implementing same question using lambda expression
        System.out.println(list1.stream().filter(p2).collect(Collectors.toList()) ) ;
	}
}
