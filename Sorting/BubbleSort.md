# Bubble Sort

## 📌 Problem Statement
Sort an array in ascending order using Bubble Sort algorithm.

---

## 💡 Idea
Bubble Sort is a simple sorting technique in which we repeatedly compare adjacent elements and swap them if they are in the wrong order.

After each pass (turn), the largest unsorted element moves to its correct position at the end of the array.

---

## ⚙️ Algorithm

1. Run outer loop from turn=0;`0 to n-2`
2. For each turn, run inner loop from `0 to n-2-turn`
3. Compare adjacent elements `arr[j]` and `arr[j+1]`
4. If `arr[j] > arr[j+1]`, swap them
5. Repeat until all elements are sorted

---

## 📊 Example

### Initial Array: [5 4 1 3 2]

### After Sorting: [1 2 3 4 5]



## ⏱ Time Complexity

- Best Case: O(n) (only in optimized version)
- Average Case: O(n²)
- Worst Case: O(n²)


## 💾 Space Complexity

- O(1)


## 🔑 Properties

- Stable: Yes  
- In-place: Yes  


## 📌 Conclusion
This is the basic implementation of Bubble Sort using O(n²) approach. 
It is simple but inefficient for large datasets. Later it can be optimized using a swapped flag to reduce unnecessary iterations.