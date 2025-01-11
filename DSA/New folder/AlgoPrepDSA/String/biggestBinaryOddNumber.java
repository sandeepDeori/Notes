package String;

import java.util.Arrays;

public class biggestBinaryOddNumber {
    
    public static void main(String[] args){

        String str = "1001" ;   //1001
        makeOddNumber(str) ;
    }

    public static void makeOddNumber(String s){
    
        int num = Integer.parseInt(s) ;
        int num1 = num , rem=0 , i=0 ;
        int[] arr = new int[s.length()] ;
        
        while(num1 != 0){
          rem=num1%10 ;
          arr[i] = rem ;
          i++ ;
          num1 = num1/10 ;
        }
        
        Arrays.sort(arr) ;
        
        int temp=0 ;
        for(int j=0 ; j<=arr.length-3 ; j++){
        
            for(int k = j ; k<=arr.length-2 ; k++){

                if(arr[j]<arr[k]){
                    temp = arr[j] ;
                    arr[j] = arr[k] ;
                    arr[k] = temp ;
                }
            }
        }
      
        for( int ele : arr)
        System.out.print(ele) ;
    }
}
