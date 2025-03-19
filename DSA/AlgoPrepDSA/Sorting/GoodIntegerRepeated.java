package Sorting;
import java.util.Arrays ;

public class GoodIntegerRepeated {

    static int bruteForce(int[] arr){
        Arrays.sort(arr) ;
        int countSmallerNo = 0, countGoodInteger = 0 , j = 0 ;
        
        for(int i=0 ; i<=arr.length-1 ; i++){
          countSmallerNo= 0 ;
          j=i-1 ; 
            while(j>=0){
                if(arr[j]!=arr[i]){
                    countSmallerNo++ ;
                }
                j-- ;
         }
         if(countSmallerNo == arr[i]){
            countGoodInteger++ ;
         }
        
        }
        return countGoodInteger ; 
    }
    
    static int betterWay(int[] arr){
      Arrays.sort(arr) ;
      int countGoodInteger= 0 ;
      boolean flag = false ;
      for(int i=0 ; i<=arr.length-1 ; i++){
        
        if(i>=1 && arr[i]!=arr[i-1]){
            flag = false ;
            if(arr[i]==i){
               countGoodInteger++ ;
               flag = true ;
           }
           
        }
        else{
            if(flag==true){
                countGoodInteger++ ;
            }
        }
      }
      return countGoodInteger ;
    }

    static int optimisedWay(int[] arr){
     int countSmallNumber = 0 , countGoodInteger=0 ;
        for(int i=1 ; i<=arr.length-1 ; i++){
        if(arr[i]!=arr[i-1]){
         countSmallNumber = i ;
        }

        if(countSmallNumber==arr[i]){
          countGoodInteger++ ;
        }     
    }
    if(arr[0]==0)
    return countGoodInteger+1 ;
    else
    return countGoodInteger ;
}
    public static void main(String[] args){
        int[] arr= {-4,-2,3,3,3,5,5,5,5,8,8,8,10,17} ;      //repeating numbers in array
        int result = optimisedWay(arr) ;
        System.out.println(result) ;      
    }
}

