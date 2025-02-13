package org.jsp.creatingThreadByRunnableInterface;

public class MainClass {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1() ;
		Thread2  t2 = new Thread2() ;
		
		Thread th1 = new Thread(t1) ;
		
		Thread th2 = new Thread(t2) ;
		
		th1.start() ;
		th2.start() ;
		
	}
}










