package Array;
public class RotateArrayByKElements {
  
  
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7} ;
    int k= 7 ;
    rotate(nums,k) ;

    for(int i=0 ; i<=nums.length-1 ; i++)
    System.out.println(nums[i]);
  }
  public static void rotate(int[] nums, int k) {
    k= k%nums.length ;
  
    rotate1(nums , 0 , nums.length-1) ;
    rotate1(nums , 0 , k-1 ) ;
    rotate1(nums  , k , nums.length-1) ;
    
 }

 public static void rotate1(int[] nums , int startingIndex, int endingIndex){
     int i=startingIndex , j=endingIndex, temp = 0 ;
     while(i<j){
     temp = nums[i] ;
     nums[i] = nums[j] ;
     nums[j] = nums[i] ;
     i++;
     j-- ;
     }
     
 }
        
}
