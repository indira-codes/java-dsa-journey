/*
Problem: Binary Search

Approach:
Use the divide-and-conquer technique to search a target element in a sorted array.

Time Complexity: O(log n)
Space Complexity: O(1)

Prerequisite:
Array must be sorted.
*/

public class BinarySearch {
    public static int  binarySearch(int arr[], int key){
        int start = 0,  end = arr.length-1;

        while(start <= end){
            // find mid
            int mid=(start+end)/2;

            if(key == arr[mid]){
                return mid;
            } if(key < arr[mid]){
                // check first half of the given array
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int arr [] = {2,4,6,8,10,12,14};
        int key=12;
        System.out.println("key is at index number : " + binarySearch(arr,key));
    }
}
