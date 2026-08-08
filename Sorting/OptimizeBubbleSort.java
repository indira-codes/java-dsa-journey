package Sorting;

import java.util.Arrays;

public class OptimizeBubbleSort {
    
    public static void optimizeBubbleSort(int sorted[]){

        int n = sorted.length;
        for(int i = 0; i<sorted.length-1; i++){
            boolean swapped = false;

            for(int j = 0; j < n - 1 - i; j++){
                if(sorted[j] > sorted[j+1]){
                    int temp = sorted[j];
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int sorted[] = {1,2,3,4,5};
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(sorted));

        optimizeBubbleSort(sorted);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(sorted));
    }
}
