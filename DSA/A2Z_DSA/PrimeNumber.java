package A2Z_DSA ;

public class PrimeNumber {
    
    public static boolean optimisedForce(int n){
     
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0){
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args){
        int num = 5 ;
        boolean result = optimisedForce(num) ;
        System.out.println(result?"Prime Number" : "Not a Prime Number") ;
    }
}
