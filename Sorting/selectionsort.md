# Selection Sort

Selection Sort is a simple comparison-based sorting algorithm.

It works by repeatedly finding the minimum element from the unsorted part of the array and placing it at the beginning of that part.

## Example

Given an array:

```text
[5, 3, 8, 1, 2]
Pass 1

Find the minimum element from the entire array.

[5, 3, 8, 1, 2]
         ↑
      minimum = 1
    
    Swap 1 with the element at index 0.

[1, 3, 8, 5, 2]

Now index 0 is sorted.

Pass 2

Find the minimum element from the remaining unsorted part.

[1 | 3, 8, 5, 2]
          ↑
       minimum = 2
    
    Swap 2 with the element at index 1.

[1, 2, 8, 5, 3]
Pass 3
[1, 2 | 8, 5, 3]
              ↑
           minimum = 3

Swap 3 with the element at index 2.

[1, 2, 3, 5, 8]

Final Sorted Array
[1, 2, 3, 5, 8]

Algorithm
1.Start from index 0.
2.Assume the current element is the minimum.
3.Search the remaining unsorted elements.
4.If a smaller element is found, update minPos.
5.After the search is complete, swap the minimum element with arr[i].
6.Move to the next position.
7.Repeat until the array is sorted.