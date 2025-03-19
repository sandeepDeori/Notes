package Recursion;

public class NthFibonacciNumber {

    public static int fibo(int n){

        if(n==1){
            return 0 ;
        }
        if(n==2){
            return 1 ;
        }

        int result = fibo(n-1) + fibo(n-2) ;
        return result ;
    }

    public static void main(String[] args) {
        int n = 7 ;
        int result = fibo(n) ;
        System.out.println(result) ;
    }
}

