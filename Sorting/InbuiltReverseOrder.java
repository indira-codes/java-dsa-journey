package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltReverseOrder{
    public static void main(String[] args) {
        
        Integer[] arr = {5,3,4,1,2};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(arr));

        // Sort in descending order
        // Arrays.sort(arr, Collections.reverseOrder());

        // System.out.println("After sorting:");
        // System.out.println(Arrays.toString(arr));


        Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

    }
}