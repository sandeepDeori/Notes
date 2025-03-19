public class MethodOverloading {

    public static int findArea(int length, int breadth){
        return length*breadth ;
    }

    public static int findArea(int length, int breadth, int height){
        return length*breadth*height ;
    }

    public static void main(String[] args) {

        int length = 2 , breadth = 1 , height = 4 ;

       int result1 = findArea(length , breadth) ;
       System.out.println(result1) ;

       int result2 = findArea(length, breadth , height) ;
       System.out.println(result2) ;
     }
}
