package A2Z_DSA.recursion;

public class sumOfNnaturalNo {

    public static int sum(int num){

        if(num==1)
        return 1 ;

        return sum(num - 1) + num ;
    }
    
    public static void main(String[] args) {
        int num = 10 ;
        int result = sum(num) ;

        System.out.println(result) ;
    }
}
