package String;

import java.util.Arrays;

public class CharMatching {
    
    public static void main(String[] args){
        String s ="" , t = "y" ;
        char res =charMatching(s,t) ;
        System.out.println(res) ;
    }

    public static char charMatching(String s , String t){
       char[] arr = s.toCharArray() ;
       char[] arr1 = t.toCharArray() ;

       Arrays.sort(arr) ;
       Arrays.sort(arr1) ;
      
       int i ;
       for( i=0 ; i<=t.length()-2 ; i++){
        if(arr1[i] != arr[i]){
            return arr1[i] ;
        }

       }
       return arr1[i] ;


    }
}
