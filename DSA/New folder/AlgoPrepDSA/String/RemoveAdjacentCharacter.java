package String;

import java.util.ArrayList;

public class RemoveAdjacentCharacter {
     
    public static String removeDuplicates(String s) {
     ArrayList<Character> al = new ArrayList<>() ;
     for(int i=0 ; i<=s.length()-1 ; i++){
        al.add(s.charAt(i)) ;
     }   
    
     
     for(int i=0 ; i<=al.size()-2 ; i++){
        if(al.get(i)==al.get(i+1)){
           al.remove(i) ;
           al.remove(i) ;
           i=i-2 ;
           if(i<0)
           i= 0 ;
        }
     }
     
     String s1 = "" ;
     for(int i=0 ; i<=al.size()-1 ; i++){
     s1 = s1 + al.get(i) ;
     }
     return s1 ;
    }

    public static void main(String[] args) {
        String s = "azxxzy" ;
        String s1 =removeDuplicates(s) ;
        System.out.println(s1) ;
    }
}
