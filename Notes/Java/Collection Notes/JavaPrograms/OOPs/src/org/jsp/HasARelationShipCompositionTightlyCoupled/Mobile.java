package org.jsp.HasARelationShipCompositionTightlyCoupled;

public class Mobile {

	Battery battery = new Battery() ;
	
	public void display() {
		System.out.println("I am mobile") ;
		battery.run() ;
	}
}
