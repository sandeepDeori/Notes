import java.util.Scanner ;

public class sumOfDigitsProductOfDigits {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter a number") ;
        int n=sc.nextInt() ;
        int sum=0 , product=1 ,digit=0;
        while(n!=0){
          digit=n%10 ;
          sum+=digit ;
          product*=digit ;
          n=n/10 ;
        }

       int result=product-sum ;
       System.out.println(result) ;
    }

}
