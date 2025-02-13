package addingTwoNumbersUsinglambda;

public class MainClass {

	public static void main(String[] args) {
		
		Sum s = (a,b)-> a+b ;
		
		System.out.println( s.add(10,20) ) ;
		
		System.out.println(s.add(50, 40)) ;
	}
}
