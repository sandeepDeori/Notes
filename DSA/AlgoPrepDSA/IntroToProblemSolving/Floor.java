// Given n return, floor(sqrt(n))

import java.util.Scanner ;
class Floor{

    public static void main(String[] args){
      Scanner sc = new Scanner(System.in) ;
      System.out.println("Enter a number ") ;
      int n=sc.nextInt() ;
      
      for(int i=1 ; i<=n/2 ; i++){
      if(i*i<=n && (i+1)*(i+1)>n){
        System.out.println(i) ;
      }

      }
    }
}