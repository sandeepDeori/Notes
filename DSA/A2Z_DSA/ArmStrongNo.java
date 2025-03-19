package A2Z_DSA;

public class ArmStrongNo {
    
    public static void main(String[] args) {
        int a = 154 , a1 = a , a2=a , rem=0 , count = 0 , sum=0 ;
        
        while(a1!=0){
            a1 = a1/10 ;
            count++ ;
        }
        
        while(a2!=0){
            rem = a2 % 10 ;
            sum = sum + (int) (Math.pow(rem , count) );
            a2 = a2/10 ;
        }

        if(sum==a){
            System.out.println("Armstrong Number ") ;
        }
        else{
            System.out.println("Not a armstrong number ") ;
        }

    }
}
