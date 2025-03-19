package String;
import java.util.Scanner ;

public class reverseString {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter a String ");
        String s =sc.nextLine() ;
          
        // char[] c =s.toCharArray() ;
        
        // char temp= 0 ;
        // int i=0 , j=s.length()-1 ;
        // while(i<j){
        //  temp = c[i] ;
        //  c[i] = c[j] ;
        //  c[j] = temp ;
        //  i++ ;
        //  j-- ;
        // }
        
        // for(char ele : c)
        // System.out.print(ele) ;

        String s2 = "" ;
        char c = 0 ;
        for(int i=0 ; i<=s.length()-1 ; i++){
            c = s.charAt(i) ;
            s2 = c + s2 ;
        }

        System.out.print(s2) ;


    }
}
