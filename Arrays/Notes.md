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
