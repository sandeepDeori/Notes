package A2Z_DSA.recursion;

public class print1ToN {
    
    public static void printNum(int n){
      
        if(n==1){
            System.out.print(n) ;
            return ;
        }

        printNum(n-1) ;
        System.out.print(" " + n ) ;
    }


    public static void main(String[] args) {
        int n = 10 ;
        printNum(n) ;


    }
}
