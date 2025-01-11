package org.jsp.creatingThreadByRunnableInterface;

public class Thread1 implements Runnable{

	public void run() {
		for(int i=0 ; i<=1000 ; i++) {
			System.out.println("Bharat is great") ;
		}
	}
}
