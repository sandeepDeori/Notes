import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String s1 = "major" , s2 = "jroma" ;

        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
        }
        else{
           char[] arr1 = s1.toCharArray() ;
           char[] arr2 = s2.toCharArray() ;

            Arrays.sort(arr1) ;
            Arrays.sort(arr2) ;

            boolean flag = false ;
            for(int i=0 ; i<=arr1.length-1 ; i++){
                if(arr1[i]!=arr2[i]){
                    flag = true ;
                    break ;
                }
            }

            if(flag){
                System.out.println("Not anagram");
            }
            else{
                System.out.println("Anagram");
            }
        }
    }
}
