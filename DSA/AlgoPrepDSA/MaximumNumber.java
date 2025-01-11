import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MaximumNumber {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>() ;
        al.add("3") ;
        al.add("35") ;
        al.add("34") ;
        al.add("5") ;
        al.add("9") ;

        ArrayList<Integer> list = new ArrayList<>() ;
        
        for(int i=0 ; i<=al.size()-1 ; i++){
        list.add(Integer.parseInt(al.get(i)) );
        }
    
        String result = "" , stemp="";
        int num1 = 0 , num2 = 0 , temp = 0  ;
        for(int i=0 ; i<=list.size()-2 ; i++){
            for(int j=i+1 ; j<=list.size()-1 ; j++){
                num1 = al.get(i).charAt(0);
                num2 = al.get(j).charAt(0) ;
                if( num1 < num2){
                   temp = list.get(i) ;
                   list.set(i,list.get(j)) ;
                   list.set(j,temp)  ;

                   stemp = al.get(i) ;
                   al.set(i,al.get(j)) ;
                   al.set(j,stemp)  ;
                }
                else if(num1 == num2){
                 String  number1 = al.get(i) + al.get(j) ;
                 String  number2 = al.get(j) + al.get(i) ;

                 if(Integer.parseInt(number1) < Integer.parseInt(number2) ){
                    temp = list.get(i) ;
                    list.set(i,list.get(j)) ;
                    list.set(j,temp)  ;
 
                    stemp = al.get(i) ;
                    al.set(i,al.get(j)) ;
                    al.set(j,stemp)  ;
                 }
                }  
            }   
        }
     for(int i= 0 ; i<=list.size()-1 ; i++)
     result = result + al.get(i) ;
       
     System.out.println(result);
    } 
}
