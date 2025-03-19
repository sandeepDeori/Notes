public class BubbleSort {
    
    public static void main(String[] args){
        int[] arr = {11, 25 , 16 , 58 , 64 , 57 , 40} ;

        int temp = 0 ;
        for(int i=0 ; i<=arr.length-2 ; i++){

            for(int j=0 ; j<=arr.length-2-i ; j++){
                if(arr[j] >= arr[j+1]){
                    temp = arr[j] ;
                    arr[j] = arr[j+1] ;
                    arr[j+1] = temp ;
                }
            }
        }

        for(int num : arr){
            System.out.println(num) ;
        }
    }
}
