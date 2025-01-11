
import java.util.Stack;

public class MinStack{

    public static Stack<Integer> addMin(Stack<Integer> min , int num ){
     
      if(min.isEmpty()){
        min.push(num) ;
      }
      else{
        if(min.peek()>num)
        min.push( num ) ;
        else
        min.push(min.peek()) ;
      }

      return min ;
    }

    public static void getMin(Stack<Integer> min){
       System.out.println(min.peek()) ;
    }


    public static void main(String[] args){
        Stack<Integer> st = new Stack<>() ;
        Stack<Integer> min = new Stack<>() ;
        
        st.push(12) ;

        min = addMin(min , 12 ) ;

        st.push(5) ;

        min = addMin(min, 5 ) ;

        st.push(68) ;

        min = addMin(min, 68) ;
        getMin(min) ;

        st.pop() ;
        min.pop() ;
        st.pop() ;
        min.pop() ;

        getMin(min);

    

    }

}