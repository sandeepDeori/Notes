package org.jsp.CustomCheckedException;

import java.util.Scanner;

public class MainClass {
	
	public static void checkSpeed(int s) throws OverSpeedException{
		
		if(s>60) {
			OverSpeedException o = new OverSpeedException() ;
			throw o ;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter Speed") ;
		int speed = sc.nextInt() ;
		
		try {
		checkSpeed(speed) ;
		System.out.println("Speed is in limits") ;
		}
		catch(OverSpeedException e) {
			System.out.println("Speed is greater than 60") ;
		}
	}
}
