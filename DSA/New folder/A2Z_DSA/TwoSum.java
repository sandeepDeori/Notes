
import java.util.HashMap; 
public class TwoSum {
    
    public static void main(String[] args) {
        int[] arr = {4,1,2,3,1} ;
        int target = 7 ;

        HashMap<Integer , Integer> map = new HashMap<Integer,Integer>() ;
        
        for(int i=0 ; i<=arr.length-1 ; i++){
            int remainingNum = target - arr[i] ;

            if(map.containsKey(remainingNum)){
                System.out.println( map.get(remainingNum) +" " + i ) ;
                break ;
            }
            else{
                map.put(arr[i] , i) ;
            }
        }

    }
}
