package org.jsp.CustomUncheckedException;

import java.util.Scanner;

public class MainClass {
	
	public static void checkDigits(String mn) {
		if(mn.length() != 10) {
			InvalidMobileNumberException m = new InvalidMobileNumberException() ;
			throw m ;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Mobile Number") ;
		String mobileNumber = sc.nextLine() ;
		
		try {
		checkDigits(mobileNumber) ;
		System.out.println("Mobile Digits are 10") ;
		}
		catch(InvalidMobileNumberException i) {
			System.out.println("Mobile digits are not 10") ;
		}
	}
}
