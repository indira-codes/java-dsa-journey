/*
PROBLEM:
Find the Maximum Subarray Sum using Kadane's Algorithm.

INTUITION:

A negative current sum can never help increase a future subarray sum.

Example:

Current Sum = -5
Next Element = 4

Option 1:
Continue previous subarray
-5 + 4 = -1

Option 2:
Start a new subarray
4

Since 4 > -1, carrying a negative sum is not beneficial.

Therefore, whenever the current sum becomes negative,
discard it and start fresh from the next element.

This is the core idea behind Kadane's Algorithm.

---

APPROACH:

1. Initialize:
   currentSum = 0
   maxSum = Integer.MIN_VALUE

2. Traverse the array.

3. Add the current element to currentSum.

4. If currentSum becomes negative:
   currentSum = 0

   Because a negative sum can never help
   create a larger future sum.

5. Update maxSum:
   maxSum = max(maxSum, currentSum)

6. After traversing the entire array,
   maxSum contains the maximum subarray sum.

---

PSEUDOCODE:

currentSum = 0
maxSum = -∞

For each element in array

```
currentSum = currentSum + element

If currentSum < 0
    currentSum = 0

maxSum = max(maxSum, currentSum)
```

Print maxSum

---

DRY RUN:

Array:
[-2,-3,4,-1,-2,1,5,-3]

currentSum = 0
maxSum = -∞

-2 → currentSum = -2 → reset to 0
maxSum = 0

-3 → currentSum = -3 → reset to 0
maxSum = 0

4 → currentSum = 4
maxSum = 4

-1 → currentSum = 3
maxSum = 4

-2 → currentSum = 1
maxSum = 4

1 → currentSum = 2
maxSum = 4

5 → currentSum = 7
maxSum = 7

-3 → currentSum = 4
maxSum = 7

Answer = 7

Subarray:
[4,-1,-2,1,5]

---

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)

---

LIMITATION:

This basic implementation fails for arrays
containing all negative elements.

Example:

[-2,-3,-1,-4]

Expected Answer:
-1

Actual Output:
0

Reason:
Whenever currentSum becomes negative,
it is reset to 0.

This issue is solved by the Improved Kadane's Algorithm.
*/


public class KadanesAlgo {
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;
            }

            ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is : " + ms);
    }

    public static void main(String[] args){
        int numbers [] = {-2,-3,4,-1,-2,1,5,-3};

        kadanes(numbers);
    }
}
