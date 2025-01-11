package org.jsp.Set;

public class Student {

	 int id ;
	 String name ;
	 double marks ;
	 String collegeName ;
	 
	 Student(int id , String name , double marks , String collegeName){
		 this.id = id ;
		 this.marks = marks ;
		 this.name = name ;
		 this.collegeName = collegeName ;
	 }
	 
	 public String toString() {
		 return "name " + this.name + " id " + this.id + " collegeName " + this.collegeName + " marks " + this.marks ;
	 }
	 
	 public int hashCode() {
		 return this.id ;
	 }
	 
	 public boolean equals(Student e) {
		 return this.hashCode() == e.hashCode() ;
	 }
}
