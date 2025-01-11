package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GetBeauty {

    static int get(List<Integer> nums , int div, List<Set<Integer>> listOfSub){
        

        int   count =0 ;
        

        
        
        Set<Integer> s1 = new HashSet<>();
        // Set<Integer> s2 = new HashSet<>();

          for (int i=0; i<nums.size() ; i++) {
            if(s1.add(nums.get(i))){
                s1.add(nums.get(i));

            }else{
                div--;
                listOfSub.add(s1);
                if(div ==0 ){
                    Set<Integer> uniq = new HashSet<Integer>(nums.subList(i, nums.size()));
                    listOfSub.add(uniq);
                    return uniq.size();
                }
                
                count += get(nums.subList(i, nums.size()), div, listOfSub);
                // break;
                
                
                // System.out.println(i);
            }
            
        }

        

       
        // System.out.println(s1.size());
        // System.out.println(s2.size());

        // System.out.println(s1);
        // System.out.println(s2);


        return s1.size();

        
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 3, 5};
        // int[] arr1 = {1, 2, 3, 4, 2, 4};

        List<Set<Integer>> listOfSub = new ArrayList<Set<Integer>>();


        int div1 = 2;
        List<Integer>  nums = Arrays.stream(arr1).boxed().collect(Collectors.toList());
  
        System.out.println(get(nums, div1, listOfSub));

        System.out.println(listOfSub);

        
            
        }

        

        




    }

