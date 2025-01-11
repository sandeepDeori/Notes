package org.jsp.Abstraction;

public class MainClass {

	public static void main(String[] args) {
		SelectHotstar s = new SelectHotstar() ;
		s.select(new HotstarPremium()) ;
		s.select(new HotstarNonPremium() ) ;
		
	    System.out.println(s.getClass() ) ;
	    System.out.println(s.toString() );
	}
}
