package org.jsp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Nokia implements Mobile{

	public void ring() {
		System.out.println("Nokia Mobile is ringing") ;
	}
}
