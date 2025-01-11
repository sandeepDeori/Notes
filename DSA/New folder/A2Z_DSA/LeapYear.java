package A2Z_DSA;

public class LeapYear {
    
    public static void main(String[] args) {
        int year = 3000 ;

        if(year%100==0){
            if(year%400==0){
                System.out.println("leap year") ;
            }
            else{
                System.out.println("Not leap year") ;
            }
        }
        else{
            if(year%4==0){
                System.out.println("leap year") ;
            }
            else{
                System.out.println("Not a leap year") ;
            }
        }
    }
}
