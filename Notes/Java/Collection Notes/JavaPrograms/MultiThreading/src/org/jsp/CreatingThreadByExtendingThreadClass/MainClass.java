package org.jsp.CreatingThreadByExtendingThreadClass;

public class MainClass {

	public static void main(String[] args) {
		Thread1  t1 = new Thread1() ;
		Thread t2 = new Thread2() ;
		
		t1.start() ;
		t2.start() ;
	}
}
