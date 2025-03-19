package Array;

import java.util.Arrays;

public class MissingNumber {
    
    public static int findMissingNumber(int[] arr){
       Arrays.sort(arr)   ;

       int startingNumber = 1 ;
       
       for(int i=0 ; i<=arr.length-1 ; i++){
        if(arr[i]==0){
            i-- ;
            continue ;
        }   
        if(startingNumber!=arr[i]){
             return startingNumber ;
           }
           startingNumber+=1 ;
       }
      return startingNumber ;
    }
    //    int starting=arr[0] ;
    //    int ending=arr[arr.length-1] ;

    //    int num=arr[0] ;
    //    for(int i=0; i<=arr.length-1 ; i++){  
    //     if(num==0){
    //         i-- ;
    //         continue ;
    //     }

    //     if(arr[i]!=num ){
    //         return num ;
    //     }
       
    //     num=num+1 ;
    //    }
    //    System.out.println("hello") ;

    //   return num ;
        
     
     
    //     int num=1 ;
        
    //     for(int i=0 ; i<=arr.length-1 ;i++){
        
    //     int b=check(arr,num) ;
    //     if(b==0  && num!=0){
    //         return num ;
    //     }
    //     num=num+1 ;
    //     }
    //   return num ;
    // }  
        
    //     static int check(int[] arr,int num){
    //         int c = 0 ;  
    //         for(int i=0 ; i<=arr.length-1 ; i++){
    //             if(num==arr[i]){
    //               c=1 ;
    //               break ;
    //             }
    //            }
    //            if(c==1){
    //             return 1 ;
    //            }
    //            else{
    //             return 0 ;
    //            }

    //     }
        

    


    public static void main(String[] args){
        int[] arr  = {1,-1,4,3} ;

        int result=findMissingNumber(arr) ;
        System.out.println(result) ;

    }

}
