
public class SelectionSort{

    public static void main(String[] args){

        int[] arr = {13,46,24,52,20,9} ;
        int temp = 0 ;
        //first loop is for indexes which we swap with min index
        for(int i=0 ; i<=arr.length-2 ; i++){
                int minIndex = i ; 
            for(int j=i+1 ; j<=arr.length-1 ; j++){
                if(arr[minIndex]>=arr[j]){
                    minIndex = j ;
                }
            }
        temp = arr[i] ;
        arr[i] = arr[minIndex] ;
        arr[minIndex] = temp ;
        }

      for(int num : arr)
      System.out.println(num) ;
       
    }
}