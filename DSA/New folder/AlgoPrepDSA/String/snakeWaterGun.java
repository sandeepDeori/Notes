package String;

import java.util.Arrays;

class snakeWaterGun{

    public static void main(String[] args){

        String s1 = "snakewatergunsnakewaterwatergunsnake" ;
        int n = 4;
        match(s1,n) ;
    
    }
  
    static void match(String s , int n){

        char[] c =s.toCharArray() ;   //string 
        String[] arr = new String[n*2] ;
        int i = 0  , k=0;
       
        while(i<=c.length-1){
        
        if(c[i]=='s' ){

         arr[k] = "snake" ;      
         i=i+5 ;
        }
        else if(c[i]=='w'){
       
           arr[k] = "water" ;
           i= i+5 ;
        }
        else{
           
            arr[k] = "gun" ;
            i= i+3 ;
        }
  
      k++ ;
      }

      int player1=0  , l=0 , j=1 ;
      for(i=1 ; i<=arr.length/2 ; i++){
      if(arr[l]=="snake" && arr[j]=="water"  ||  arr[l]=="water" && arr[j]=="gun" || arr[l]=="gun" && arr[j]=="snake"){
      player1++ ;
      }
      l+=2 ;
      j+=2 ;
    }

    System.out.println(player1) ;

}

}