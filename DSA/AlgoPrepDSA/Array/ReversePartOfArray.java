package Array;

public class ReversePartOfArray {
    
    static void reverseArray(int[] arr , int i , int j){
        int temp=0 ;

        while(i<j){
            temp = arr[i] ;
            arr[i] = arr[j] ;
            arr[j] = temp ;
            i++ ;
            j-- ;
        }
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60,70,80,90,100} ;
        int startingIndex = 3  , endingIndex= 7 ;
      
        System.out.println("Before reverse") ;
        for(int i=0 ; i<=arr.length-1 ; i++){
            System.out.print(arr[i] + " ") ;
        }

        reverseArray(arr,startingIndex,endingIndex) ;

        System.out.println("\nAfter reverse ") ;
        for(int i=0 ; i<=arr.length-1 ; i++){
            System.out.print(arr[i]+" ") ;
        }
    }
}
