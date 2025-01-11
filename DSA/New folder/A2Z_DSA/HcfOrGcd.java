package A2Z_DSA;

public class HcfOrGcd {
    
    //Euclidean algorithm
    static int optimisedApproach(int a, int b) {
        int  temp = 0;

        while (a != 0 && b != 0) {
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            a = a % b;
        }

        return Math.max(a,b) ;
    }
    
    static int bruteForce(int a, int b){
        
        for(int i= Math.min(a,b) ; i>=1 ; i--){
            if(a%i==0 && b%i==0){
                return i ;
            }
        }
        return 0 ;
    }

    public static void main(String[] args) {

        int a = 11, b = 11;

        int result = bruteForce(a,b) ;
        System.out.println(result) ;

    }
}
