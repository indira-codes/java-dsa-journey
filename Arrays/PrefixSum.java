/*
PROBLEM:
Find the Maximum Subarray Sum using the Prefix Sum technique.

APPROACH:

1. Create a Prefix Sum Array.

   * prefix[i] stores the sum of elements from index 0 to i.
   * This allows us to calculate any subarray sum in O(1) time.

2. Initialize:

   * maxSum = Integer.MIN_VALUE
   * currSum = 0

3. Build Prefix Array:
    prefix[0] = numbers[0]

    For each index i from 1 to n-1:
    prefix[i] = prefix[i-1] + numbers[i]

4. Generate all possible subarrays:

   * Outer loop selects the start index.
   * Inner loop selects the end index.

5. Calculate current subarray sum:
    Case 1:
    If start == 0
    currSum = prefix[end]

    Case 2:
    Otherwise
    currSum = prefix[end] - prefix[start-1]

6. Compare current sum with maximum sum:
    If currSum > maxSum
    maxSum = currSum

7. After checking all subarrays,
    rint maxSum.

TIME COMPLEXITY:

* Building Prefix Array: O(n)
* Finding all subarrays: O(n²)
* Subarray sum calculation: O(1)

Overall Time Complexity: O(n²)

SPACE COMPLEXITY:
O(n)
(Because of the Prefix Array)

WHY PREFIX SUM?

Brute Force Approach:

* For every subarray, traverse elements again.
* Time Complexity = O(n³)

Prefix Sum Approach:

* Store cumulative sums once.
* Any subarray sum can be calculated in O(1).
* Reduces overall complexity from O(n³) to O(n²).

INTERVIEW EXPLANATION:

The Prefix Sum technique preprocesses the array by storing cumulative sums.
Using the formula:

subarraySum = prefix[end] - prefix[start-1]

we can find any subarray sum in constant time instead of traversing the subarray repeatedly.
This improves the brute force solution from O(n³) to O(n²).
*/


public class PrefixSum {
    public static void maxSubarraySum(int numbers[]){
        int currSum=0;
        int maxSum =Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array running total
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;

                currSum=  start == 0 ? prefix[end] :  prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }

        System.out.println("max sum = " + maxSum);

    }

    public static void main(String []args){
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
