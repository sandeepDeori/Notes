package implementingThreadUsingLambda;

public class MainClass {

	public static void main(String[] args) {
		
	//Implementing runnable interface using lambda expression	
		
		
//		Thread t = new Thread(()->{
//			for(int i=1 ; i<=5 ; i++) {
//				System.out.println("Happy birthday Captain Pawan Kumar") ;
//			}
//		}) ;
//		
//		t.start();
		
		 
		
		Runnable r1 = ()->{
			for(int i=1 ; i<=5 ; i++)
				System.out.println("Happy birthday Captain Pawan Kumar") ;
		} ;
		 
		Thread t2 = new Thread(r1) ;
		t2.start();
		
		
		
		
		
//		Runnable r = ()->{
//			for(int i=1 ; i<=10 ; i++) {
//				System.out.println(5*i) ;
//			}
//		} ;
//		
//		Thread t3 = new Thread(r) ;
//		t3.start() ;
	}
}
