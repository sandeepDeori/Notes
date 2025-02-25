public class InsertionSort {
    
    public static void main(String[] args){
   
        int[] arr = {14,9,15,12,6,8,13} ;
        int temp = 0 ;
        for(int i=1 ; i<=arr.length-1 ; i++){
            int j = i ;
            while(j>=1 && arr[j]<arr[j-1] ){
                  temp = arr[j] ;
                  arr[j] = arr[j-1] ;
                  arr[j-1] = temp ;
                  j-- ;
            }
        }

        for(int num : arr){
            System.out.println(num) ;
        }
    }
}
