

public class MoveZeroToEnd {
    
    public static void bruteForce(int[] arr){
        int[] temp = new int[arr.length] ;
        
        int j = 0 ;
        for(int i=0 ; i<=arr.length-1 ; i++){
            if(arr[i]!=0){
                temp[j] = arr[i] ;
                j++ ;
            }
        }
        
        for(int i=0 ; i<=temp.length-1  ; i++){
          arr[i]  = temp[i] ;
        }

      
    }
   


    public static void main(String[] args){
        int[] arr = {1,0,2,3,2,0,0,4,5,1} ;
        bruteForce(arr);
        for(int ele : arr){
            System.out.print(ele+" ") ;
        }
    }
}
