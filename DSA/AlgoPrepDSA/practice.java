

interface demo{
    public void run() ;
}

class demo1 implements demo{
    public void run(){
        System.out.println("running") ;
    }
}

interface dem extends demo{

}


public class practice {
    public static void main(String[] args) {
        dem d = new demo1() ;

    }
    
}
