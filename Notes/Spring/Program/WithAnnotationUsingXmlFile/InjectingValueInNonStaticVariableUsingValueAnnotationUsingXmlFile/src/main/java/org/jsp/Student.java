package org.jsp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("1")
	int id ;
	
	@Value("Major Sudhir Kumar Walia")
	String name ;
	
	@Value("100")
	double marks ;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
