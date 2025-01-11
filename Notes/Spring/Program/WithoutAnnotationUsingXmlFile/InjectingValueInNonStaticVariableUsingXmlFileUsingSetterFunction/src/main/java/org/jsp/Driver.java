package org.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("myConfig.xml") ;
		Student s = con.getBean("myStudent" , Student.class) ;
		System.out.println(s.getId()) ;
		System.out.println(s.getName()) ;
	}
}
