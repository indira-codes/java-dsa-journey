package STACK;

public class StockSpan {

    // THIS IS THE BRUTEFORCE APPROACH

    static void printSpan(int[] arr){

        for(int i = 0; i < arr.length; i++){

            int span = 1;

            // Check previous elements
            for(int j = i-1; j >= 0 && arr[j] <= arr[i]; j--){

                span++;

            }
            // print the final span for current element
            System.out.print(span + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {18,12,13,14,11,16};
        printSpan(arr);
        }
}
