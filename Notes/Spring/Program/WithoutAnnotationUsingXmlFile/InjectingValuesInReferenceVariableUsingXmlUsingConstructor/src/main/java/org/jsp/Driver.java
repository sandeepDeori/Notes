package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("myConfig.xml") ;
		Mobile m = con.getBean("myMobile" , Mobile.class) ;
		m.display() ;
	}
}
