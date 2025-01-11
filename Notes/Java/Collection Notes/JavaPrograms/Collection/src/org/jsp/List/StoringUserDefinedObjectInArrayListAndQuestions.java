package org.jsp.List;

import java.util.ArrayList;

public class StoringUserDefinedObjectInArrayListAndQuestions {

	public static void main(String[] args) {
		Student s1 = new Student(1 , "Major Vivek Jacob" , 80.24 , "IMA") ;
		Student s2 = new Student(2 , "Major Harshan Nair" , 98.24 , "NDA") ;
		Student s3 = new Student(3 , "Major Mohit Sharma" , 99.47 , "OTA") ;
		Student s4 = new Student(4 , "Flying Officer Karthik" , 70.57 , "AFA") ;
		
		
		ArrayList al = new ArrayList() ;
		
		al.add(s1) ;
		al.add(s2) ;
		al.add(s3) ;
		al.add(s4) ;
		al.add(4) ;
		al.add(45.26) ;
		al.add("Major Harshan Nair") ;
		
		System.out.println(al) ;
	   
		//printing ArrayList objects 
	   for(Object ele : al) {
		   System.out.println(ele) ;
	   }
        
	   
	   
	   System.out.println("\nStudent whose marks are greater than 90") ;
	   for(Object ele : al) {
		 if(ele instanceof Student) {
		   if( ((Student)ele).marks > 90 ) {
			 System.out.println(ele) ;
		    }
		 }
	   }
	   
	   
	   
	   System.out.println("Updating marks of Student based on Student Id") ; // id-4 update student marks from 70.57 to 80.95
	   
	   for(Object ele : al) {
		 
		 if(ele instanceof Student){
		   Student s = (Student)ele ;
		   if(s.id == 4) {
			 s.marks = 80.95 ;
			 System.out.println("Marks updated \n" + s) ;
		   }
		 }
	   }
	   
	   
	   
	   System.out.println("Count of Student") ;
	   
	   int count = 0 ;
	   for(Object ele : al) {
		   if(ele instanceof Student) {
			   count++ ;
		   }
	   }
	   
	   System.out.println("Count of student is " + count) ;
	   
	   
	   System.out.println("Accessing only student details ") ;
	   
	   for(Object ele: al) {
		   if(ele instanceof Student) {
			   Student s = (Student)(ele) ;
			   System.out.println(s) ;
		   }
	   }
	}
}
