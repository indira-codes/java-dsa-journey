package Sorting;

import java.util.Arrays;

public class SelectionSort{

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int min_idx = i;
            for(int j = i+1; j < n; j++){
                if(arr[min_idx] > arr[j]){
                    // update min_idx if a smaller is found
                    min_idx = j;
                }
            }

            // move minimum element to it's correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    static void printArray(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64,25,22,12,11};

        System.out.print("Original array: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("Sorted array: ");
        printArray(arr);
    }
}