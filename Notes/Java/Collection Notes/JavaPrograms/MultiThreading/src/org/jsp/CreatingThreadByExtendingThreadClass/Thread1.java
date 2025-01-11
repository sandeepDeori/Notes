package org.jsp.CreatingThreadByExtendingThreadClass;

public class Thread1 extends Thread{

	@Override
	public void run() {
		
		for(int i=1 ; i<=500 ; i++) {
			System.out.println("Father of Pakistan is India") ;
		}
	}
}
