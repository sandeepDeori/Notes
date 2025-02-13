package BasicsOfStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DifferentWaysOfCreatingStream {

	public static void main(String[] args) {
		
		//we will get an empty stream
		Stream emptyStream = Stream.empty() ;
		
		
		String[] names = {"CaptainHarshan" , "MajorJacob" , "GeneralRawat"} ;
		
		
		//list will convert into streams
		Stream<String> stream1 = Stream.of(names) ;
		
		System.out.println(stream1.filter((str -> str.toLowerCase().charAt(0) == 'c' )).collect(Collectors.toList())) ;
		
		
	     List<String> list1 = new ArrayList<>() ;
	     list1.add("CaptainShubhamGupta") ;
	     list1.add("ColonelKaushal") ;
	     list1.add("CaptainPawanKumar") ;
	     
	     //list will convert into stream
	     Stream s =  list1.stream() ;
		 s.forEach(e -> System.out.println(e)) ;
		
	}
}
