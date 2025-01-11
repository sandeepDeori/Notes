package org.jsp.ThrowsKeyword;

import java.util.Scanner;

public class MainClass {
	
	public static int Division(int a , int b) throws ArithmeticException {
		return a/b ;
	}

	public static void main(String[] args) throws ArithmeticException{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter 2 numbers") ;
		int a = sc.nextInt() ;
		int b = sc.nextInt() ;
  		int result = Division(a,b) ;
  		System.out.println(result) ;
  		
	}
}
