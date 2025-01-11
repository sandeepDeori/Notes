package Array;

import java.util.Scanner ;
public class MaxOfAllElements {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter array size") ;
        int size = sc.nextInt() ;
        int[] arr= new int[size] ;
        
        System.out.println("Enter "+ size + " Array Elements") ;
        for(int i=0 ; i<=arr.length-1 ; i++){
            arr[i] = sc.nextInt() ;
        }

        int max=0 ;

        for(int i=0 ; i<=arr.length-1 ; i++){
            if(max<arr[i])
            max=arr[i] ;
        }

        System.out.println("Maximum element in array is "+ max) ;
    }
}
