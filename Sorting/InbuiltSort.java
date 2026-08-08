package Sorting;
import java.util.Arrays;

public class InbuiltSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};

        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));

        // inbuilt sorting
        Arrays.sort(arr);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(arr));
    }
}
