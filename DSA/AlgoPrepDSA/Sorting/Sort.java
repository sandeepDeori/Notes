package Sorting;

public class Sort {

    static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = 0; j <= arr.length - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void insertionSort(int[] arr) {

        // int temp= 0 ;
        // for(int i=1 ; i<=arr.length-1 ; i++){
        // int key = i ;
        // for(int j=i-1 ; j>=0 ; j--){
        // if(arr[key]<arr[j]){
        // temp =arr[j] ;
        // arr[j] = arr[key] ;
        // arr[key] = temp ;
        // key = j ;
        // }
        // else{
        // break ;
        // }
        // }
        // }

        for (int i = 1; i <= arr.length - 1; i++) {
            int temp = 0;
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else{
                    break ;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 50, 87, 96, 14, 5, 21, 34, 1 };
        insertionSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

}
