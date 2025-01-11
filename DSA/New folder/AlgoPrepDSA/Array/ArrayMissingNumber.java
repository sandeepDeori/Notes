package Array;
import java.util.Arrays;


public class ArrayMissingNumber 
{
    public static void main(String[] args)
    {
    int[] arr = {-5,-8,-1,1,2,3,4} ;
    int n=4;
    System.out.println(find(arr,n));
}
    public static int find(int[]arr,int n)
    {
    int res=n*(n+1)/2;
    int sum=Arrays.stream(arr).filter(k->k>0).sum();
    return res-sum==0?n+1:(res-sum);
    }

}


