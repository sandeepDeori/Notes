import java.util.Scanner ;
public class SumOfNNaturalNumber {
    
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in) ;
      System.out.println("Enter a number till where you want to sum ") ;
      int n = sc.nextInt() ;
      int sum =0  ;
    //   for(int i=0 ; i<=n ; i++){
    //     sum=sum+i ;
    //   }

      sum=n*(n+1)/2 ;
      System.out.println(sum) ;
    }
}
