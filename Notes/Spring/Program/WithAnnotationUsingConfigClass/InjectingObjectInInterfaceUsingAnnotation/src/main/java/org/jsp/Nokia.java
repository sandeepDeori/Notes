package org.jsp;

import org.springframework.stereotype.Component;

@Component
public class Nokia implements Mobile{

	public void ring() {
		System.out.println("Nokia Mobile is ringing") ;
	}
}
