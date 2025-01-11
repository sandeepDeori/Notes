package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class) ;
		Mobile m = con.getBean("mobile" , Mobile.class) ;
		m.display() ;
	}
}
