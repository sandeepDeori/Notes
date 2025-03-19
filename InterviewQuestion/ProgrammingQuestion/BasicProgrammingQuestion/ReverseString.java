public class ReverseString {

    public static void main(String[] args) {
        String str = "Major Vivek" ;
        String s1 = "" ;

        for(int i=str.length()-1 ; i>=0 ; i--){
            char c = str.charAt(i) ;
            s1 = s1 + c ;
        }

        System.out.println(s1) ;
    }
}
