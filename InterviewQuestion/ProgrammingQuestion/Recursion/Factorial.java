package Recursion;

public class Factorial {

    public static int fact(int n){
      if(n==1)
          return 1 ;

      int result =  fact(n-1)*n ;
      return result ;
    }

    public static void main(String[] args) {
        int n = 6 ;
        System.out.println(fact(n) ) ;
    }
}
