package BasicsOfStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicsOfStream {

	public static void main(String[] args) {
		
		//Ways of creating list -> 3 ways 
		
	List<Integer> l1= List.of(12,14,16,97,25,43,88) ; //returns immutable list

	
	List<Integer> l2 = Arrays.asList(20,45,87,98,56,12,11) ; //returns fixed size list means cannot add or delete elements but we can modify elements at existing indices
	
	List<Integer> al = new ArrayList<>() ;
	al.add(28) ;
	al.add(39) ;
	al.add(48) ;
	al.add(12) ;
	al.add(15) ;
	
	
		//without stream creating a list of even elements from l1
		List<Integer> evenList = new ArrayList<>();
		for(int ele : l1) {
			if(ele%2==0) {
				evenList.add(ele) ;
			}
		}
		System.out.println(evenList) ;
		
		
		
		//using stream -> only even numbers
		List<Integer> evenNum = l1.stream().filter(i -> i%2 == 0).collect(Collectors.toList()) ;
		System.out.println(evenNum) ;
		
		List<Integer> greaterThan50list = l1.stream().filter(i->i>50).collect(Collectors.toList()) ;
		System.out.println(greaterThan50list) ;
		
		
	}
}
