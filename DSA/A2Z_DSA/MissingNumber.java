package A2Z_DSA;

public class MissingNumber {
    

    public static int missingNumber(int[] nums){
        int n = nums.length , arrSum=0;
        int totalSum = (int) (n * ( (n+1)/2.0) ) ;
        System.out.println(totalSum);
      

        for(int i=0 ; i<=nums.length-1 ; i++){
            arrSum = arrSum + nums[i] ;
        }

        return totalSum - arrSum ;
    }
    public static void main(String[] args) {
        int[] nums = {0,1} ;

        int ans = missingNumber(nums) ;
        System.out.println(ans) ;
    }
}
