package Sorting ;
import java.util.Arrays;

public class GoodInteger {

    public static void main(String[] args){
        int[] arr = {-1,-4,3,5,-15,4} ;       
        Arrays.sort(arr) ;
        int count=0 ;
        for(int i=0 ; i<=arr.length-1 ; i++){
         if(arr[i]==i){
            count++ ;
         }
        }
        System.out.println(count) ;
        
    }
}
