package Array2D;

public class printColWise {
    
    public static void main(String[] args){
    int[][] arr= { 
                  {10,20,30,40,50} ,
                  {60,70,80,90,100} ,
                  {110,120,130,140,150} ,
                  {160,170,180,190,200} 
                  } ;
    
    for(int i=0 ; i<=arr[i].length-1 ; i++){
        for(int j=0 ; j<=arr.length-1 ; j++){
            System.out.print(arr[j][i] + " ") ;
        }
        System.out.println() ;
    }


    }
}
