/*
Problem: Smallest Element in Array

Description:
Find the minimum element present in the given array.

Approach:
1. Initialize smallest with Integer.MAX_VALUE.
2. Traverse the array.
3. Compare each element with smallest.
4. Update smallest if current element is smaller.
5. Return smallest.

Time Complexity: O(n)
Space Complexity: O(1)
*/


import java.util.*;

public class SmallestNum {
    public static int getSmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String []args){
        int numbers[] = {1,3,5,8,4,6};
        System.out.println("Smallest Element is : " + getSmallest(numbers));
    }
}
