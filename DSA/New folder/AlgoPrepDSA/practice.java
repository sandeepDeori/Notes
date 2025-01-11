

public class practice {
    
    public static void main(String[] args) {
        int n=3 ;
        int[] arr = new int[n] ;
        int count = 1 ;
        for(int i=0 ; i<=n-1 ; i++){
            arr[i] = count ;
        }
        
        for(int a : arr){
        System.out.println(a) ;
        }
    }
}
