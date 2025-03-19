import java.util.Scanner;

public class NthFibonacciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the nth number");
        int num = sc.nextInt() ;

        int n1 = 0 , n2 = 1 , n3 = 0;

        for(int i= 1 ; i<=num ; i++){
            if(num==i) {
                System.out.println(n1) ;
                break ;
            }
            n3 = n1+n2 ;
            n1 = n2 ;
            n2 = n3 ;
        }
    }
}
