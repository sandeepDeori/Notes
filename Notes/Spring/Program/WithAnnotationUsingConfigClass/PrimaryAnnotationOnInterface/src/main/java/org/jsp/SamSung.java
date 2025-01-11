package org.jsp;

import org.springframework.stereotype.Component;

@Component
public class SamSung implements Mobile{

	public void ring() {
		System.out.println("Samsung mobile is ringing") ;
	}
}
