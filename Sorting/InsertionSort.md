Insertion Sort Algorithm

Algorithm: Insertion Sort

1. Start from the second element of the array (i = 1), because the first element is considered already sorted.
2. Store the current element in a variable curr.
3. Set prev = i - 1.
4. Compare arr[prev] with curr.
5. If arr[prev] > curr, shift arr[prev] one position to the right.
6. Decrease prev by 1 and continue comparing.
7. Repeat the shifting until:
    . prev < 0, or
    . arr[prev] <= curr.
8. Insert curr at arr[prev + 1].
9. Repeat steps 2–8 for all remaining elements.
10.The array is now sorted in ascending order.

SHORT VERSION TO REMEMBER
Start from index 1
       ↓
Pick current element (curr)
       ↓
Compare with previous elements
       ↓
If previous > curr → shift right
       ↓
Move prev backward
       ↓
Find correct position
       ↓
Insert curr
       ↓
Repeat