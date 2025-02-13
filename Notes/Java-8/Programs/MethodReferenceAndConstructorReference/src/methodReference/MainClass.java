package methodReference;

public class MainClass {

	public static void main(String[] args) {
		
	//providing the implementation to Task interface and implementation taken of isRun() method of Run class
		
    //Syntax of method reference          ClassName::MethodName
	  Task t = Run::isRun ;
	  
	  t.doTask() ; 
	  
	}
}
