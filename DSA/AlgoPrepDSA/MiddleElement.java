import java.util.ArrayList;

public class MiddleElement {
    
    public static void main(String[] args) {
        int[] arr = {1,6,7,66,16666,1656,2063,3665} ;

        ArrayList<Integer> al = new ArrayList<>() ;
        int count = 0 , n = 0 , n1 = 0;

        for(int i=0 ; i<=arr.length-1 ; i++){
            n = arr[i] ;
            n1 = n ;

            while(n!=0){
                count++ ;
                al.add(n%10) ;
                n = n / 10 ;
            }

            if(count%2==0){
                if(al.get(count/2)==6 || al.get((count-1)/2)==6 ){
                    System.out.println(n1) ;
                }
            }
            else{
                if(al.get(count/2)==6)
                System.out.println(n1) ;
            }

            count=0 ;
            al.clear() ; 
        }
    }
}
