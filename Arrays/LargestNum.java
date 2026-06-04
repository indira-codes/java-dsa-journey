
/*
Problem: Largest Element in Array

Description:
Find the largest element present in the given array.

Approach:
1. Initialize largest with Integer.MIN_VALUE.
2. Traverse the array.
3. Compare each element with largest.
4. Update largest if current element is greater.
5. Return largest.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;


public class LargestNum {
    
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(largest < numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        System.out.println("Largest Number is : " + getLargest(numbers));
    }
}
