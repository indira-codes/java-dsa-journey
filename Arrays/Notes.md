# Linear Search

## Idea
Check each element one by one until the key is found.

## Time Complexity
- Best Case: O(1)
- Average Case: O(n)
- Worst Case: O(n)

## Space Complexity
O(1)

## When to Use
- Unsorted arrays
- Small datasets
- When simplicity is preferred



## Largest Element in Array

### Problem
Find the maximum element present in an array.

### Approach
- Initialize largest with Integer.MIN_VALUE.
- Traverse the array.
- If current element is greater than largest, update largest.
- Return largest at the end.

### Example

Input:
[1, 2, 6, 3, 5]

Output:
6

### Time Complexity
O(n)

### Space Complexity
O(1)

## Smallest Element in Array

### Problem
Find the minimum element present in an array.

### Approach
- Initialize smallest with Integer.MAX_VALUE.
- Traverse the array.
- If current element is smaller than smallest, update smallest.
- Return smallest after traversal.

### Example

Input:
[1, 3, 5, 8, 4, 6]

Output:
1

### Time Complexity
O(n)

### Space Complexity
O(1)

## Binary Search

### Problem

Search for a target element in a sorted array.

### Prerequisite

The array must be sorted in ascending or descending order.

### Idea

Binary Search repeatedly checks the middle element and eliminates half of the remaining search space.

Instead of searching every element one by one, it divides the search range into two halves, making it much faster than Linear Search.

### Algorithm

1. Initialize `start = 0` and `end = n - 1`.
2. Find the middle index:
   `mid = (start + end) / 2`
3. If `arr[mid] == key`, return `mid`.
4. If `key < arr[mid]`, search in the left half.
5. If `key > arr[mid]`, search in the right half.
6. Repeat until the element is found or `start > end`.
7. If not found, return `-1`.

### Pseudocode

```text
BinarySearch(arr, key)

start = 0
end = arr.length - 1

while start <= end
    mid = (start + end) / 2

    if arr[mid] == key
        return mid

    else if key < arr[mid]
        end = mid - 1

    else
        start = mid + 1

return -1
```

### Example

Input:
[2, 4, 6, 8, 10, 12, 14]

Key:
12

Output:
5

### Time Complexity

* Best Case: O(1)
* Average Case: O(log n)
* Worst Case: O(log n)

### Space Complexity

* O(1)

### Comparison with Linear Search

| Feature               | Linear Search | Binary Search      |
| --------------------- | ------------- | ------------------ |
| Array Sorted Required | No            | Yes                |
| Time Complexity       | O(n)          | O(log n)           |
| Search Method         | One by One    | Divide and Conquer |

### Key Takeaway

Binary Search is efficient because it reduces the search space by half in every iteration. It should be used whenever the array is sorted.



# REVERSE ARRAY 

## Problem

Reverse the elements of an array without using an extra array.

## Approach

Use two pointers:

* `first` starts from the beginning of the array.
* `last` starts from the end of the array.

Swap the elements at both pointers and move them toward the center until they meet.

## Pseudocode

START

FUNCTION reverse(arr)

```
first ← 0
last ← length(arr) - 1

WHILE first < last

    temp ← arr[last]
    arr[last] ← arr[first]
    arr[first] ← temp

    first ← first + 1
    last ← last - 1

END WHILE
```

END FUNCTION

STOP

## Dry Run

Input:
[2, 4, 6, 8, 10]

Step 1:
Swap 2 and 10
[10, 4, 6, 8, 2]

Step 2:
Swap 4 and 8
[10, 8, 6, 4, 2]

Output:
[10, 8, 6, 4, 2]

## Time Complexity

O(n)

## Space Complexity

O(1)


6.# Print All Pairs in an Array

## Problem

Print all possible unique pairs of elements present in an array.

## Approach

Use two nested loops:

* The outer loop selects the first element of the pair.
* The inner loop selects the remaining elements after the current element.
* This ensures that no pair is repeated.

## Example

Input:
[2, 4, 6, 8, 10]

Output:
(2,4) (2,6) (2,8) (2,10)
(4,6) (4,8) (4,10)
(6,8) (6,10)
(8,10)

## Dry Run

For i = 0 (2):

* (2,4)
* (2,6)
* (2,8)
* (2,10)

For i = 1 (4):

* (4,6)
* (4,8)
* (4,10)

And so on...

## Formula for Total Pairs

For an array of size n:

Total Pairs = n × (n - 1) / 2

Example:
n = 5

Total Pairs = 5 × 4 / 2 = 10

## Complexity Analysis

Time Complexity: O(n²)

* Nested loops are used.

Space Complexity: O(1)

* No extra data structure is used.

## Key Learning

This problem introduces nested loops and demonstrates how combinations of elements can be generated without repetition. It is a common foundation for many brute-force DSA problems.



//SUBARRAYS
# Print All Subarrays of an Array 

## Problem

Print all possible contiguous subarrays of a given array and count the total number of subarrays.

## What is a Subarray?

A subarray is a contiguous part of an array.

Example:

Array:
[2, 4, 6]

Subarrays:
[2]
[2, 4]
[2, 4, 6]
[4]
[4, 6]
[6]

## Approach

Three nested loops are used:

1. The first loop selects the starting index.
2. The second loop selects the ending index.
3. The third loop prints all elements between the start and end indices.

This generates every possible contiguous subarray.

## Dry Run

Input:
[2, 4, 6]

Start = 0

[2]
[2, 4]
[2, 4, 6]

Start = 1

[4]
[4, 6]

Start = 2

[6]

Total Subarrays = 6

## Formula

For an array of size n:

Total Subarrays = n × (n + 1) / 2

Example:

n = 5

Total Subarrays = 5 × 6 / 2 = 15

## Complexity Analysis

Time Complexity: O(n³)

* First loop chooses the start index.
* Second loop chooses the end index.
* Third loop prints elements from Start to end  of the subarray.

Space Complexity: O(1)

## Key Learning

This problem helps understand:

* Arrays
* Nested Loops
* Start and End Index Concepts
* Subarrays vs Subsequences
* Brute Force Approach

Understanding subarray generation is important because many DSA problems such as Maximum Subarray Sum, Kadane's Algorithm, and Sliding Window techniques are built on this concept.



# Maximum Subarray Sum - Brute Force Approach

## Problem Statement

Given an integer array, find the maximum possible sum among all contiguous subarrays.

Example:

Input:
[1, -2, 6, -1, 3]

Possible Subarrays:
[1]
[1, -2]
[1, -2, 6]
...
[6, -1, 3]

Maximum Sum = 8

## Intuition

To find the maximum subarray sum, we first need to examine every possible subarray.

A subarray is defined by:

* A starting index
* An ending index

For each possible pair of start and end indices:

1. Generate the subarray.
2. Calculate its sum.
3. Compare the sum with the maximum sum found so far.
4. Update the maximum sum if the current sum is larger.

Since we are checking every possible subarray and calculating its sum separately, this is called the Brute Force Approach.

## Understanding the Three Loops

### Loop 1: Choose Starting Index

The outer loop fixes the starting point of the subarray.

Example:

start = 0 → [1], [1,-2], [1,-2,6], ...
start = 1 → [-2], [-2,6], ...
start = 2 → [6], [6,-1], ...

This loop decides where a subarray begins.

### Loop 2: Choose Ending Index

For each starting index, the second loop selects all possible ending indices.

Example:

start = 0

end = 0 → [1]
end = 1 → [1,-2]
end = 2 → [1,-2,6]
end = 3 → [1,-2,6,-1]

This loop decides where a subarray ends.

### Loop 3: Traverse the Subarray

Once start and end are fixed, the third loop visits every element inside that subarray.

Example:

start = 0
end = 2

Subarray = [1,-2,6]

sum = 1 + (-2) + 6 = 5

This loop calculates the current subarray sum.

## Pseudocode

Initialize maxSum = -∞

For each start index i

```
For each end index j

    currentSum = 0

    For each element k from i to j

        currentSum += arr[k]

    If currentSum > maxSum

        maxSum = currentSum
```

Print maxSum

## Dry Run

Array:

[1, -2, 6, -1, 3]

Subarrays and Sums:

[1]            → 1
[1,-2]         → -1
[1,-2,6]       → 5
[1,-2,6,-1]    → 4
[1,-2,6,-1,3]  → 7

[-2]           → -2
[-2,6]         → 4
[-2,6,-1]      → 3
[-2,6,-1,3]    → 6

[6]            → 6
[6,-1]         → 5
[6,-1,3]       → 8   ← Maximum

Maximum Subarray Sum = 8

## Complexity Analysis

Number of subarrays:

n × (n + 1) / 2

For every subarray, we traverse its elements again.

Therefore:

Time Complexity = O(n³)

Space Complexity = O(1)

## Interview Explanation (30 Seconds)

"I use the brute-force approach where I generate every possible subarray using two loops for start and end indices. Then a third loop calculates the sum of the current subarray. After computing each sum, I compare it with the maximum sum found so far and update it if necessary. Since every subarray is generated and traversed, the time complexity is O(n³) and the space complexity is O(1)."


********
# Maximum Subarray Sum using Prefix Sum

## Goal

Find the maximum sum among all possible contiguous subarrays.

Example:

Input:
[1, -2, 6, -1, 3]

Maximum Subarray Sum:
8

Subarray:
[6, -1, 3]

---

## Intuition

In the brute-force approach, every subarray sum is calculated by traversing its elements again and again.

This results in:

Time Complexity = O(n³)

To optimize this, we use Prefix Sum.

A Prefix Array stores cumulative sums:

prefix[i] = sum of elements from index 0 to i

Example:

Array:
[1, -2, 6, -1, 3]

Prefix:
[1, -1, 5, 4, 7]

---

## Prefix Sum Formula

For any subarray:

start → beginning index
end → ending index

If start == 0:

currSum = prefix[end]

Otherwise:

currSum = prefix[end] - prefix[start - 1]

This gives the subarray sum in O(1) time.

---

## Algorithm

1. Create a Prefix Array.
2. Store cumulative sums in Prefix Array.
3. Generate all possible start indices.
4. Generate all possible end indices.
5. Calculate subarray sum using Prefix Sum formula.
6. Update maxSum whenever a larger sum is found.
7. Print maxSum.

---

## Pseudocode

Create prefix array

prefix[0] = arr[0]

For i from 1 to n-1
prefix[i] = prefix[i-1] + arr[i]

maxSum = -∞

For each start index

```
For each end index

    If start == 0
        currSum = prefix[end]
    Else
        currSum = prefix[end] - prefix[start-1]

    maxSum = max(maxSum, currSum)
```

Print maxSum

---

## Complexity Analysis

Brute Force:
Time Complexity = O(n³)
Space Complexity = O(1)

Prefix Sum:
Time Complexity = O(n²)
Space Complexity = O(n)

---

## Key Learning

Prefix Sum stores running totals (cumulative sums).

Instead of recalculating the sum of every subarray, we reuse previously computed information.

This is a common optimization technique known as preprocessing.


******
# Kadane's Algorithm (Basic Version)

## Goal

Find the Maximum Subarray Sum in O(n) time.

---

## Core Idea

If the current sum becomes negative, carrying it forward will only reduce future sums.

Therefore:

Discard negative current sums and start fresh.

Example:

Current Sum = -5

Next Element = 4

Continue:
-5 + 4 = -1

Start Fresh:
4

Since 4 > -1, starting fresh is better.

---

## Algorithm

1. Initialize:
   currentSum = 0
   maxSum = -∞

2. Traverse the array.

3. Add current element to currentSum.

4. If currentSum becomes negative:
   reset currentSum to 0.

5. Update maxSum.

6. Print maxSum.

---

## Pseudocode

currentSum = 0
maxSum = -∞

For each element

```
currentSum += element

If currentSum < 0
    currentSum = 0

maxSum = max(maxSum, currentSum)
```

Print maxSum

---

## Complexity

Time Complexity: O(n)

Space Complexity: O(1)

---

## Limitation

Fails for all-negative arrays.

Example:

[-2,-3,-1,-4]

Expected:
-1

Output:
0

Reason:
Negative sums are always reset to zero.

This limitation is fixed in Improved Kadane's Algorithm.

***********
# Enhanced Kadane's Algorithm

## Core Idea

At every index:

- Start a new subarray from the current element.
- OR continue the previous subarray.

Choose the option that gives a larger sum.

Formula:

currentSum = max(arr[i], currentSum + arr[i])

maxSum = max(maxSum, currentSum)

---

## Why It Works

A negative running sum may reduce future results.

Instead of blindly resetting to 0, we compare:

1. Current element alone
2. Current element + previous subarray

and choose the better option.

---

## Advantages

✔ Handles mixed positive-negative arrays

✔ Handles all-negative arrays

✔ Handles all-positive arrays

✔ Handles single-element arrays

---

## Complexity

Time Complexity: O(n)

Space Complexity: O(1)

---

## Interview One-Liner

Kadane's Algorithm finds the maximum subarray sum in linear time 
by deciding at every index whether to start a new subarray or extend 
the previous one.