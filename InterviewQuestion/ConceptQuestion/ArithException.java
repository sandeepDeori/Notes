public class ArithException {

    public static void main(String[] args) {
        try {
            int result = 12 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("Do not divide by zero") ;
        }
    }
}
