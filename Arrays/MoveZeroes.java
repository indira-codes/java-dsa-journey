package Arrays;

public class MoveZeroes {

    static void pushZerosToEnd(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        pushZerosToEnd(arr);

        // Print the array
        System.out.print("Array after moving zeros: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}