public class PalindromeString {

    public static void main(String[] args) {
        String str= "lebel" ;

        int i = 0 , j=str.length()-1 ;
        boolean flag = false ;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                flag = true ;
                break ;
            }
            i++ ;
            j-- ;
        }

        if(flag){
            System.out.println("Not plaindrome");
        }
        else{
            System.out.println("Palindrome");
        }



    }
}
