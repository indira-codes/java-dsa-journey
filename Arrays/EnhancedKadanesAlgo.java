/*
PROBLEM:
Find the Maximum Subarray Sum using Kadane's Algorithm.

--------------------------------------------------

INTUITION:

At every index, we have two choices:

1. Start a new subarray from the current element.
2. Continue the previous subarray.

We choose whichever gives a larger sum.

Formula:

currentSum = max(arr[i], currentSum + arr[i])

This allows the algorithm to handle:
✔ Mixed positive and negative arrays
✔ All negative arrays
✔ All positive arrays
✔ Single element arrays

--------------------------------------------------

APPROACH:

1. Initialize:
      currentSum = arr[0]
      maxSum = arr[0]

2. Traverse the array from index 1.

3. For every element:
      currentSum = max(arr[i], currentSum + arr[i])

   This decides whether:
   - Start a new subarray

OR
   - Extend the existing subarray

4. Update maximum sum:
      maxSum = max(maxSum, currentSum)

5. After traversal,
   maxSum contains the maximum subarray sum.

--------------------------------------------------

PSEUDOCODE:

currentSum = arr[0]
maxSum = arr[0]

for i = 1 to n-1

    currentSum =
        max(arr[i],
            currentSum + arr[i])

    maxSum =
        max(maxSum,
            currentSum)

print maxSum

--------------------------------------------------

EXAMPLE:

Array:
[-2,-3,4,-1,-2,1,5,-3]

Maximum Subarray:
[4,-1,-2,1,5]

Maximum Sum:
7

--------------------------------------------------
TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)

--------------------------------------------------
*/



public class EnhancedKadanesAlgo {
    public static void EnhancedKadanes(int arr[]){

        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++){
            // Either start a new subarray
            // or continue the previous one
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);

        }
    System.out.println("Maximum Subarray Sum = " + maxSum);

    }

    public static void main(String[] args){
        int arr[] = {-2, -3, -1, -4};
        
        EnhancedKadanes(arr);
    }
}
