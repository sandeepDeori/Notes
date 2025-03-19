package Array;

import java.util.Arrays;

public class MissingRepeatedNumber {
    
    static int[] findNumber(int[] arr ){
      Arrays.sort(arr) ; 
      int[] arr1 = {0,0};
      int num = 0 ;
      for(int i=0 ; i<=arr.length-2 ; i++){
        if(arr[i]==arr[i+1]){
            num = arr[i] ;
            break ;

        }
      }
    
    arr1[0] = num ;

    int startingNumber = 1 ;
   for(int i=0 ; i<=arr.length-1 ; i++){
    
    if(startingNumber == arr[i]){
      startingNumber ++ ;
    }
    else{
        arr1[1]=startingNumber ;
    }
   }
    
    return arr1 ;
     
    }

    public static void main(String[] args){
        int[] arr = {1,3,3,4} ;
        int[] arr1 = {0,0} ;
        arr1=findNumber(arr) ;
        System.out.println(arr1[0]) ;
        System.out.println(arr1[1]) ;
    }
 }
