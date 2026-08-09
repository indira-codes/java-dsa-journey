# 🔢 Counting Sort

Counting Sort is a sorting algorithm that sorts elements by **counting the frequency of each number** instead of comparing elements with each other.

---

## 🧠 Basic Idea

Suppose we have:

```text
[1, 4, 1, 3, 2, 4, 3, 7]
```

First, we count how many times each number appears:

```text
Number:  0  1  2  3  4  5  6  7
Count:   0  2  1  2  2  0  0  1
```

This tells us:

- `1` appears 2 times
- `2` appears 1 time
- `3` appears 2 times
- `4` appears 2 times
- `7` appears 1 time

Now we read the count array from left to right and rebuild the original array:

```text
[1, 1, 2, 3, 3, 4, 4, 7]
```

---

# 🔄 Algorithm

### Step 1: Find the largest element

We need the largest element to decide the size of the `count` array.

```java
int largest = Integer.MIN_VALUE;

for (int i = 0; i < arr.length; i++) {
    largest = Math.max(largest, arr[i]);
}
```

---

### Step 2: Create the count array

```java
int count[] = new int[largest + 1];
```

If:

```text
largest = 7
```

then:

```text
count = [0, 0, 0, 0, 0, 0, 0, 0]
```

The index represents the number.

```text
index →  0  1  2  3  4  5  6  7
```

---

### Step 3: Count the frequency

```java
for (int i = 0; i < arr.length; i++) {
    count[arr[i]]++;
}
```

For example, if:

```java
arr[i] = 4;
```

then:

```java
count[4]++;
```

This means:

> One more `4` has been found.

---

### Step 4: Rebuild the sorted array

```java
int j = 0;

for (int i = 0; i < count.length; i++) {

    while (count[i] > 0) {

        arr[j] = i;
        j++;

        count[i]--;
    }
}
```

Here:

- `i` = **which number to insert**
- `j` = **where to insert it**

For example:

```text
i = 3
count[3] = 2
```

So `3` is inserted twice:

```text
arr[j] = 3
arr[j] = 3
```

---

# 💻 Java Implementation

```java
package Sorting;

public class CountingSort {

    public static void countingSort(int arr[]) {

        // Step 1: Find the largest element
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Create count array
        int count[] = new int[largest + 1];

        // Step 3: Count frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 4: Rebuild the sorted array
        int j = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {

                arr[j] = i;
                j++;

                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        System.out.println("Before Sorting:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        countingSort(arr);

        System.out.println("\n\nAfter Counting Sort:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

### Output

```text
Before Sorting:
1 4 1 3 2 4 3 7

After Counting Sort:
1 1 2 3 3 4 4 7
```

---

# 🧩 Dry Run

Given:

```text
arr = [1, 4, 1, 3, 2, 4, 3, 7]
```

### Frequency Array

```text
Number:  0  1  2  3  4  5  6  7
Count:   0  2  1  2  2  0  0  1
```

### Rebuilding

```text
1 → 2 times
2 → 1 time
3 → 2 times
4 → 2 times
5 → 0 times
6 → 0 times
7 → 1 time
```

Therefore:

```text
[1, 1, 2, 3, 3, 4, 4, 7]
```

---

# 🧠 Memory Trick

Remember Counting Sort as:

```text
L → C → F → R
```

### L → Largest

Find the largest element.

### C → Count Array

Create the `count[]` array.

### F → Frequency

Count every element.

```java
count[arr[i]]++;
```

### R → Rebuild

Put elements back in sorted order.

```java
arr[j] = i;
```

So:

> **Find Largest → Create Count → Count Frequency → Rebuild**

---

# ⏱️ Complexity

Let:

- `n` = number of elements
- `k` = range of values

| Complexity | Value |
|---|---|
| Time | `O(n + k)` |
| Space | `O(k)` |

Counting Sort can be faster than comparison-based sorting when the range of values is small.

---

# ⚠️ Limitation

Counting Sort works best when the range of numbers is relatively small.

For example:

```text
[1, 2, 3, 4, 5, 3, 2]
```

is a good case.

But:

```text
[1, 1000000]
```

would require a very large count array.

Also, this basic implementation works with **non-negative integers**. Negative numbers require an additional technique such as an offset.

---

# 🎯 Key Takeaway

Counting Sort does not compare elements.

It follows this simple idea:

```text
Count how many times each number appears
                ↓
Read numbers from smallest to largest
                ↓
Put them back into the array
```

### Most Important Lines

```java
count[arr[i]]++;
```

**Count the frequency.**

```java
arr[j] = i;
```

**Put the number back in sorted order.**

```java
count[i]--;
```

**One occurrence has been used.**