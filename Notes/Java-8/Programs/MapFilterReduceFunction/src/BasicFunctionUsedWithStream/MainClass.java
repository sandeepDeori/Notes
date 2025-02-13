package BasicFunctionUsedWithStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class MainClass {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(24,26,12,16,89,54,21) ;
		
		
	    //forEach - forEach take consumer means function which does not return anything
		list1.stream().filter(i->i<25).map(i->i*2).forEach(e->System.out.println(e))  ;
		
		List<String> list2 = Arrays.asList("CaptainShubhamGupta" , "CaptainHarshanRNair" , "GeneralRawat" , "MajorVivekJacob"  ) ;
		
		list2.stream().filter(str->str.toLowerCase().charAt(0)=='c').forEach(str->System.out.println(str)) ;
		
		
		System.out.println("ascending order") ;
		//sorted - by default increasing
		list1.stream().sorted().forEach(num->System.out.println(num)) ;
		
		
		System.out.println("descending order") ;
		//sorted - sort in descending
		list1.stream().sorted((num1,num2)->num2.compareTo(num1)).forEach(num->System.out.println(num)) ;
		
		System.out.println("minimum number") ;
		//min
		System.out.println(list1.stream().min((x,y)->x.compareTo(y)).get() ) ;
		
		 
		System.out.println("maximum number") ;
		//max
		System.out.println(list1.stream().max((x,y)->x.compareTo(y)).get() ) ;
		
		
	}
}
