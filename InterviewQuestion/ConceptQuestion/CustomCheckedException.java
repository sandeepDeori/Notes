import java.util.Scanner;

class OverSpeedException extends Exception{

}

public class CustomCheckedException {

    public static void checkSpeed(int speed) throws OverSpeedException{
        if(speed>60){
            throw new OverSpeedException() ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter speed") ;
        int speed = sc.nextInt() ;

        try {
            checkSpeed(speed);
            System.out.println("UnderSpeed");
        }
        catch(OverSpeedException o){
            System.out.println("OverSpeed");
        }
        finally{
            sc.close() ;
        }
    }

}
