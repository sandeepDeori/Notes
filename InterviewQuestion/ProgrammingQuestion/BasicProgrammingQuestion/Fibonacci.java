import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter how many Fibonacci numbers you want");
        int num = sc.nextInt() ;

        int n1 = 0 , n2 = 1 , n3=0;

        for(int i=1 ; i<=num ; i++){
            System.out.println(n1) ;
            n3 = n1+n2 ;
            n1 = n2 ;
            n2 = n3 ;
        }
    }
}
