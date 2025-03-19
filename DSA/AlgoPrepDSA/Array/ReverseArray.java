package Array;

public class ReverseArray {

    static void swap(int[] arr){
     
        int i=0 , j=arr.length-1 , temp =0 ;
        while(i<j){
            temp=arr[i] ;
            arr[i]=arr[j] ;
            arr[j] =arr[i] ;
            i++ ;
            j-- ;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50} ;
       
        System.out.println("Before swap") ;
        for(int i=0 ; i<=arr.length-1 ; i++){
            System.out.print(arr[i] + " ") ;
        }

        swap(arr) ;
        
        System.out.println("\nAfter swap") ;

        for(int i=0 ; i<=arr.length-1 ; i++){
            System.out.print(arr[i]+" ") ;
        }
    }
    
}
