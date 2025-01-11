public class Stringg {
    
    public static void main(String[] args) {
        String s = "Abcd13-12745697" ;
        char c = 0 ;
        int num = 0 ;
        String s1 = "" ;

        int result1 = 1 ;
        int result2 = 1 ;
        int num1 = 0 ;
        int num2 = 0 ;
        String s11 ="" ;
        String s22="" ;

        for(int i=0 ; i<=s.length()-1 ; i++){
         c = s.charAt(i) ;
         if( c>='0' && c<='9'){
         s1 = ""+c ;
         num = Integer.parseInt(s1) ;
          if(num%2==0){
             
            char c1 = s.charAt(i-1) ;
            char c2 = s.charAt(i+1) ;

            if(c1>='0' && c1<='9'){
                s11 = "" + c1 ;
                num1 = Integer.parseInt(s11) ;
        
                for(int j=num1 ; j>=1 ; j++){
                  result1 = result1*num1 ;
                   
                }
                 System.out.println(result1) ;
               
            }
            if(c2>='0' && c2<='9'){
                s22 = "" + c2 ;
                num2 = Integer.parseInt(s22) ;
                for(int j=num2 ; j>=1 ; j++){
                    result2 = result2*num2 ;
                 }
                 System.out.println(result2) ;
            }
          } 
         }
         c = 0 ;
         num = 0 ;
         s1 = "" ;
         s11="" ;
         s22="" ;
         num1 = 0 ;
         num2 = 0 ;
         result1= 0 ;
         result2=0 ;
        }
    }
}
