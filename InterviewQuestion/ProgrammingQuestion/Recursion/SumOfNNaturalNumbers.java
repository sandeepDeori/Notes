package Recursion;

public class SumOfNNaturalNumbers {

    public static int sum(int n){
        if(n==1)
            return 1 ;

         int result = sum(n-1) + n ;
         return result ;
    }

    public static void main(String[] args) {
        int n = 4 ;

        int result = sum(n) ;
        System.out.println(result) ;
    }
}



