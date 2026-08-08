package Sorting;


public class InsertionSort {
    
    public static void insertionSort(int arr[]){

        int n = arr.length;
        for(int i = 1; i < n; i++){
            int curr = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] < curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;

        }
    }

    static void printArr(int[] arr){
        for(int value : arr){
            System.out.print(value +" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        System.out.print("Original Array : ");
        printArr(arr);

        System.out.println("After Insertion Sorting : ");
        insertionSort(arr);
        printArr(arr);
    }
}
