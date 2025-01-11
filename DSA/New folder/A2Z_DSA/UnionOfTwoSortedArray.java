package A2Z_DSA;

import java.util.ArrayList;
import java.util.TreeSet;

public class UnionOfTwoSortedArray {
    
    public static ArrayList<Integer> bruteForce(int[] arr1 , int[] arr2){
        TreeSet<Integer> ts = new TreeSet<Integer>() ;
        
        for(int ele : arr1){
            ts.add(ele) ;
        }
        
        for(int ele : arr2){
            ts.add(ele) ;
        }

        ArrayList<Integer> al = new ArrayList<Integer>() ;
       
        for(int ele : ts){
            al.add(ele) ;
        }
        
        return al ;
    } 


    public static void main(String[] args) {
        int[] arr1 = {1,1,2,3,4,5} ;
        int[] arr2 = {2,3,4,4,5,6} ;

        ArrayList<Integer> al = bruteForce(arr1,arr2) ;
  
        for(int ele : al){
            System.err.print(ele+ " ");
        }
        
    }
}
