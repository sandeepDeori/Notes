import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GenerateKthPalindromeNumber {

    public static boolean checkPalindrome(int num){
       ArrayList<Integer> al = new ArrayList<>() ;
       
       while(num!=0){
        al.add(num%10) ;
        num = num/10 ;
       }
       int i=0 , j = al.size()-1 ;

       while(i<j){
        if(al.get(i)!=al.get(j)){
            return false ;
        }
        i++ ;
        j-- ;
       }
       return true ;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>() ;
        q.add(1) ;
        q.add(2) ;
        int k = 6 ;
        int count=0 , num = 0  ;
        boolean result = false ;

        while(true){
         num = q.poll() ;

         result = checkPalindrome(num) ;
         if(result==true){
            count++ ;
         }

         if(count==k)
         break ;

         q.add(num*10+1) ;
         q.add(num*10+2) ;
        }

        System.out.println(num) ;
    }
}
