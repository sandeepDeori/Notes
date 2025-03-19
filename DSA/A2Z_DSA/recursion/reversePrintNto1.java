package A2Z_DSA.recursion;

public class reversePrintNto1 {

    public static void printNto1(int num){
       
        
        if(num==1){
            System.out.print(num) ;
            return ;
        }

        System.out.print(num + " ") ;
        printNto1(num-1) ;
        
    }
    
    public static void main(String[] args){
        int num = 10 ;
        printNto1(num) ;
    }
}
