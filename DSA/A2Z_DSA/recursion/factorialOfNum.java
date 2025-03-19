package A2Z_DSA.recursion;

public class factorialOfNum {

    public static long factorial(int n){
        if(n==1){
            return 1 ;
        }

        return factorial(n-1)* n ;
    }
    
    public static void main(String[] args) {
        int n = 4 ;
        long result =factorial(n) ;
        System.out.println(result) ;
    }
}
