# 📌 Find Maximum Odd Element Using Streams

## Problem Statement

Given an integer array `arr[]`, return the **maximum odd element** from the array using Java Streams.

### Example 1

```text
Input:  arr[] = [1, 2, 3, 4]
Output: 3
```

**Explanation:**

Odd elements are:

```text
1, 3
```

The maximum odd element is:

```text
3
```

### Example 2

```text
Input:  arr[] = [3, 2, 1]
Output: 3
```

**Explanation:**

Odd elements are:

```text
3, 1
```

The maximum odd element is:

```text
3
```

### Constraints

```text
1 ≤ arr.length ≤ 10⁵
1 ≤ arr[i] ≤ 10⁵
```

---

# 💡 Approach

We need to perform **two operations**:

1. Find only the odd elements.
2. Find the maximum among those odd elements.

We can do both using Java Streams.

### Step 1: Convert Array into Stream

```java
Arrays.stream(arr)
```

Since `arr` is an `int[]`, this creates an `IntStream`.

```text
int[] arr
    ↓
Arrays.stream(arr)
    ↓
IntStream
```

---

### Step 2: Filter Odd Elements

We use:

```java
.filter(x -> x % 2 != 0)
```

### Why `x % 2 != 0`?

The `%` operator gives us the **remainder** after division.

For an even number:

```text
2 % 2 = 0
4 % 2 = 0
6 % 2 = 0
```

For an odd number:

```text
1 % 2 = 1
3 % 2 = 1
5 % 2 = 1
```

Therefore:

```java
x % 2 != 0
```

means:

> Keep the number if its remainder after dividing by 2 is not zero.

For example:

```text
[1, 2, 3, 4]
      ↓
    filter
      ↓
[1, 3]
```

`filter()` is an **intermediate operation** because it returns another stream.

---

### Step 3: Find Maximum

After filtering, we have only odd numbers.

```java
.max()
```

finds the largest number.

```text
[1, 3]
   ↓
 max()
   ↓
  3
```

However, `max()` returns an `OptionalInt`, not a direct `int`.

---

### Step 4: Get the Actual Integer

We use:

```java
.getAsInt()
```

to extract the actual integer from the `OptionalInt`.

So the complete expression is:

```java
Arrays.stream(arr)
      .filter(x -> x % 2 != 0)
      .max()
      .getAsInt();
```

---

# 🔄 Complete Flow

```text
              Array
        [1, 2, 3, 4]
               ↓
      Arrays.stream(arr)
               ↓
           IntStream
               ↓
     filter(x -> x % 2 != 0)
               ↓
          [1, 3]
               ↓
             max()
               ↓
        OptionalInt[3]
               ↓
          getAsInt()
               ↓
               3
```

---

# 💻 Java Code

```java
import java.util.Arrays;

public class MaximumOddElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int maxOdd = Arrays.stream(arr)
                           .filter(x -> x % 2 != 0)
                           .max()
                           .getAsInt();

        System.out.println("Maximum odd element: " + maxOdd);
    }
}
```

### Output

```text
Maximum odd element: 3
```

---

# 🔍 Why `filter()`?

We don't want all elements.

We only want:

```text
Odd numbers
```

Therefore, we use `filter()`.

```java
.filter(x -> x % 2 != 0)
```

Think of `filter()` as a **gate**:

```text
1 → ✅ Keep
2 → ❌ Remove
3 → ✅ Keep
4 → ❌ Remove
```

Result:

```text
[1, 3]
```

---

# 🔍 Why `max()`?

After filtering, only odd numbers remain.

Now we need the largest odd number.

Therefore:

```java
.max()
```

For:

```text
[1, 3]
```

the result is:

```text
3
```

---

# 🔍 Why `getAsInt()`?

The `max()` method returns:

```java
OptionalInt
```

instead of directly returning:

```java
int
```

because the filtered stream could be empty.

For example:

```text
[2, 4, 6]
```

After filtering odd numbers:

```text
[]
```

There is no maximum odd element.

`OptionalInt` allows Java to represent the possibility that no value exists.

If we know an odd element exists, we can use:

```java
.getAsInt()
```

to get the actual `int`.

---

# ⚡ Stream Operations Used

### `filter()`

**Type:** Intermediate Operation

```java
.filter(x -> x % 2 != 0)
```

Purpose:

> Select only odd elements.

### `max()`

**Type:** Terminal Operation

```java
.max()
```

Purpose:

> Find the maximum element.

### `getAsInt()`

Purpose:

> Extract the actual `int` value from `OptionalInt`.

---

# 🔄 Traditional Approach vs Stream

### Traditional Approach

```java
int maxOdd = Integer.MIN_VALUE;

for (int num : arr) {

    if (num % 2 != 0 && num > maxOdd) {
        maxOdd = num;
    }
}
```

### Stream Approach

```java
int maxOdd = Arrays.stream(arr)
                   .filter(x -> x % 2 != 0)
                   .max()
                   .getAsInt();
```

The Stream approach expresses the logic directly:

```text
Filter odd numbers
       ↓
Find maximum
```

---

# ⏱️ Complexity

### Time Complexity

```text
O(n)
```

Every element may need to be checked.

### Space Complexity

```text
O(1)
```

No additional data structure proportional to the input size is required.

---

# ⚠️ Important Edge Case

Consider:

```text
arr[] = [2, 4, 6]
```

There is no odd element.

After filtering:

```text
[]
```

Therefore:

```java
.max()
```

returns an empty `OptionalInt`.

Calling:

```java
.getAsInt()
```

on an empty `OptionalInt` causes an exception.

A safer version is:

```java
OptionalInt result = Arrays.stream(arr)
                           .filter(x -> x % 2 != 0)
                           .max();

if (result.isPresent()) {
    System.out.println(result.getAsInt());
} else {
    System.out.println("No odd element found");
}
```

---

# 🧠 Key Takeaways

* `Arrays.stream(arr)` converts `int[]` into an `IntStream`.
* `filter()` selects elements based on a condition.
* `x % 2 != 0` checks whether a number is odd.
* `max()` finds the largest element.
* `max()` returns an `OptionalInt`.
* `getAsInt()` extracts the actual integer.
* The main Stream pattern is:

```java
Arrays.stream(arr)
      .filter(condition)
      .max()
      .getAsInt();
```

### ⭐ Memory Trick

```text
Array
  ↓
Stream
  ↓
FILTER → only what you need
  ↓
MAX → biggest value
  ↓
getAsInt → actual int
```
