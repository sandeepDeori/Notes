package Array;
import java.util.Scanner ;

public class swapValuesViaArray {
    
    static void swap(int[] arr){
    int  temp = 0 ;
    temp = arr[0] ;
    arr[0]= arr[1] ;
    arr[1] = temp ;
    
   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] arr = new int[2] ;

        System.out.println("enter 2 number ") ;
        arr[0] = sc.nextInt() ;
        arr[1] = sc.nextInt() ;
        
        swap(arr) ;
         
        System.out.println("After swapping ") ;
        for(int i=0 ; i<=arr.length-1 ; i++){
            System.out.println(arr[i]);
        }
        

    }
}
