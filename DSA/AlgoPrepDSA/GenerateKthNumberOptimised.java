import java.util.PriorityQueue;
import java.util.Queue;

public class GenerateKthNumberOptimised {
    
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>() ;
        q.add(1) ;
        q.add(2) ;
        int k = 7 , count = 0 ;
        int num =0 , num1=0 , num2=0 ;
        while(count!=k){
           num = q.poll() ;
           count++ ;
           if(count==k)
           break ;

           num1 = num*10+1 ;
           q.add(num1) ;
           num2 = num1+1 ;
           q.add(num2) ; 
        }

       System.out.println("result is "+num) ;



    }
}
