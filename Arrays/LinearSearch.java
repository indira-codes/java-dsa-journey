/*
Problem: Linear Search

Description:
Search a key element in an array by checking each element one by one.

Approach:
Traverse the array from left to right.
If the current element equals the key, return its index.
If the key is not found after checking all elements, return -1.

Time Complexity: O(n)
Space Complexity: O(1)
*/

public class LinearSearch {
    public static int linearSearch(int numbers[], int key) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 8;

        int index = linearSearch(numbers, key);

        if(index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}