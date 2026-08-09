package STREAM;

import java.util.Arrays;

public class MaximumOddElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int maxOdd = Arrays.stream(arr)
                        .filter(x -> x % 2 != 0)
                        .max()
                        .getAsInt();

        System.out.println("Maximum odd element: " + maxOdd);
    }
}
