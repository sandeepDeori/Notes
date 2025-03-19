
import java.util.Scanner;

// BRUTE FORCE APPROACH
/* 
class CountFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to know the count of its factors ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        System.out.println("Total number of factors in " + n + " is " + count);

    }
}
*/

// OPTIMISE APPROACH
class CountFactors {
    
    static int countFactors(int n){
     int count=0 ;
        for(int i=1 ; i*i<=n ; i++){
                   
            if(n%i==0){
                if(n/i!=i){
                    count+=2 ;
                }
                else{
                    count++ ;
                }
            }
           
        }
        return count ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number to count its factors ") ;
        int n = sc.nextInt() ;
        int result=0 ;
        result=countFactors(n) ;
        System.out.println("the count of factors of "+n+" is "+ result) ;
    }

}
