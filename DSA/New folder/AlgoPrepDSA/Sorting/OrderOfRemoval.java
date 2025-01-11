package Sorting;
import java.util.Arrays ;

public class OrderOfRemoval {
 
     static int bruteForce(int[] arr){
        Arrays.sort(arr) ;
        int sum = 0 ;
        for(int i=0 ; i<=arr.length-1 ; i++){
           for(int j=arr.length-1-i ; j>=0 ; j--){
            sum = sum + arr[j] ;
            
           }
           System.out.println(sum);
        }
        
        return sum ;
     }

     static int optimisedWay(int[]arr){
        int sum=0 ;
        Arrays.sort(arr) ;
        for(int i=0 ; i<=arr.length-1 ; i++){
           sum =(arr[i]*(arr.length-i))+sum ;
        }
        return sum ;
     }

    public static void main(String[] args){
        int[] arr = {4,6,2,7} ;
        int ans= optimisedWay(arr) ;
        System.out.println(ans) ;    
    }

    //optimised way


}
