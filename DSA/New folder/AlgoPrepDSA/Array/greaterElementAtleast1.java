package Array;

public class greaterElementAtleast1 {
    
    public static void main(String[] args) {
        int[] arr = {-4,-3,7,9,3,9,4,7,10} ;

        int max= arr[0] ;

        for(int i=1 ; i<=arr.length-1 ; i++){
            if(max<arr[i]){
              max = arr[i] ;
            }
        }
        
        int count=0 ;
        for(int i=0 ; i<=arr.length-1 ; i++){
            if(arr[i]<max)
            count++ ;
        }

        System.out.println(count);
    }
}
