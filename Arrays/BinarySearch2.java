package Arrays;

public class BinarySearch2 {
    public static int binarySearch(int numbers[], int key){
        int start = 0; int end = numbers.length-1;

        while(start <= end){
            int mid = (start + end) / 2;

            // comparisons
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String [] args){
        int [] numbers = {12,21,23,32,34,43,45,54,65};

        int key = 43;

        System.out.println("Key is found at index: " + binarySearch(numbers, key));
    }
}
