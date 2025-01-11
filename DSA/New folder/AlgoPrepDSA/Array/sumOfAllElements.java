package Array;

import java.util.Scanner ;
public class sumOfAllElements {
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in) ;
       System.out.println("Enter size of a array ") ;
       int n= sc.nextInt() ;
       int[] arr = new int[n] ;
       
       System.out.println("Enter the elements ") ;
       for(int i=0 ; i<=arr.length-1 ; i++){
        arr[i] = sc.nextInt() ;
       }
       
       int sum=0 ;
       for(int i=0 ; i<=arr.length-1 ; i++){
        sum+=arr[i] ;
       }
       
       System.out.println("Sum of all elements is "+sum) ;
    }
}
