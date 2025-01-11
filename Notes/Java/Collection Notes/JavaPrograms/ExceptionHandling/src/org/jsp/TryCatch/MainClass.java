package org.jsp.TryCatch;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter two Numbers") ;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
		int result = a/b ;
		System.out.println(result) ;
		}
		catch(ArithmeticException e) {
		System.out.println("Don't divide by zero") ;
		}
		finally {
			System.out.println("Program finished") ;
		}
		
	}
}
