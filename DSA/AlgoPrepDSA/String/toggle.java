package String;

public class toggle {
    
       public static void main(String[] args) {
        String s1 = "AlgoPrep" ;
        String s2 = "" ;
        char c= 0 ;
        for(int i=0 ; i<=s1.length()-1 ; i++){
             c=s1.charAt(i) ;
             if(c<97){
                c=(char)(c+32) ;
             }
             else{
                c=(char)(c-32) ;
             }
             s2=s2+c ;
        }
        System.out.println(s2);
       }
}
