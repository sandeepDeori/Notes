package methodReferenceInThread;

public class MainClass {

	public static void main(String[] args) {
		
		//giving implementation of run method present inside runnable interface
		Runnable r = AshokChakraAwardee::name ;
		
		
		Thread th = new Thread(r) ;
		th.start() ;
	}
}
