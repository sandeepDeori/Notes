package basicsOfLambda;

public class MainClass {

	public static void main(String[] args) {
     
		
		//implementation through lambda expression
		Demo d1 = ()->System.out.println("implementation 1 through lambda expression") ;
	

		d1.run() ;
    
	
		Demo d3 = ()-> System.out.println("implementation 2 through lambda expression") ;
		
		
		d3.run();
		
		
		//implementation through anonymous class
	    Demo d2 = new Demo() {
	    	
	    	public void run() {
	    		System.out.println("implementation 1 through anonymous class") ;
	    	}
	    };
	    
	    d2.run() ;
	    
	}
}
