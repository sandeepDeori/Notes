

public class GenerateKthNumberInSeriesUsing1_2 {

    public static boolean check(int num){
        int rem = 0 ;
       while(num!=0){
          rem = num%10 ;
          if(rem==1 || rem==2){
            num = num/10 ;
          }
          else{
            return false;
          }
       }
       return true ;
    }

    public static void main(String[] args) {
        int count= 0 , num=0 , k=7 ;
        boolean result = false ;
        for(int i=1 ; count<=k-1 ; i++){
          
          result = check(i) ;
          if(result==true){
          count++ ;
          num = i ;
          result= false ;
          }
        }
        System.out.println(num) ;
    }
}
