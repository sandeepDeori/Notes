package String;

public class ExcelSheet{

    public static void main(String[] args) {
       
            String s = "BA" ;
            char[] arr =s.toCharArray() ;
            int n = arr.length ;
            int[] arr1 = new int[n-1] ;
            int sum=0 ;

            for(int i=0 ; i<=arr.length-2 ; i++){
            arr1[i] =  26*((int)(arr[i]) - 64 ) ;
            }
            
            for(int ele :arr1){
                sum=sum+ele ;
            }

            sum= sum+ ( (int)(arr[arr.length-1] ) - 64) ;
            System.out.println(sum);
      
    }
}