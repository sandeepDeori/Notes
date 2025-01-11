package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(MyConfig.class) ;
		Car c = con.getBean("car" , Car.class) ;
		c.display(); 
	}
}
