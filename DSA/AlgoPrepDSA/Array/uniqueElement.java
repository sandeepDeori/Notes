package Array;
import java.util.Arrays;

public class uniqueElement {
    
    public static void main(String[] args){
        int[] arr ={1,6,2,4,2,5,5,6,4} ;
        
        Arrays.sort(arr) ;
        
        int i=0 ;
        for(i=0 ; i<=arr.length-3 ; i++){
            if(arr[i]==arr[i+1]){
                i+=1 ;
            }
            else{
                System.out.println(arr[i]) ;
                break ;
            }
        }
        
        if(i==arr.length-1)
        System.out.println(arr[arr.length-1]) ;
    }
}
