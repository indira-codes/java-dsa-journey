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

