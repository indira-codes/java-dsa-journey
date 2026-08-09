# 🚀 Problem: Find Maximum Element Using Streams

## 📌 Problem Statement

Given an integer array `arr[]`, return the **maximum element** from the array using Java Streams.

### Example 1

```text
Input:  arr[] = [1, 2, 3, 4]
Output: 4
```

**Explanation:**
From the given array, `4` is the maximum element.

### Example 2

```text
Input:  arr[] = [3, 2, 1]
Output: 3
```

**Explanation:**
From the given array, `3` is the maximum element.

### Constraints

```text
1 ≤ arr.length ≤ 10³
1 ≤ arr[i] ≤ 10³
```

---

# 💡 Approach

We can find the maximum element using the Java Stream API.

### Step 1: Convert Array into Stream

We use:

```java
Arrays.stream(arr)
```

Because `arr` is an `int[]`, this creates an **IntStream**.

```text
int[] arr
    ↓
Arrays.stream(arr)
    ↓
IntStream
```

---

### Step 2: Find the Maximum Element

After creating the stream, we use:

```java
.max()
```

The `max()` method checks the elements in the stream and finds the largest value.

```text
1 → 2 → 3 → 4
          ↓
        max()
          ↓
          4
```

However, `max()` returns an `OptionalInt`, not a direct `int`.

---

### Step 3: Get the Actual Integer

We use:

```java
.getAsInt()
```

to extract the actual `int` value from the `OptionalInt`.

So the complete expression becomes:

```java
Arrays.stream(arr)
      .max()
      .getAsInt();
```

### Complete Flow

```text
Array
[1, 2, 3, 4]
      ↓
Arrays.stream(arr)
      ↓
IntStream
      ↓
max()
      ↓
OptionalInt[4]
      ↓
getAsInt()
      ↓
4
```

Since the constraints guarantee:

```text
arr.length ≥ 1
```

the array cannot be empty, so `getAsInt()` is safe for this problem.

---

# 💻 Java Code

```java
import java.util.Arrays;

public class ArrayMaxUsingStream {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int max = Arrays.stream(arr)
                        .max()
                        .getAsInt();

        System.out.println("Maximum element: " + max);
    }
}
```

### Output

```text
Maximum element: 4
```

---

# 🔍 Why `Arrays.stream(arr)`?

`arr` is a normal Java array.

A normal array does not have a `.stream()` method:

```java
arr.stream(); // ❌ Not valid
```

Therefore, we use the `Arrays` utility class:

```java
Arrays.stream(arr);
```

It converts the array into a stream.

For an `int[]`, the result is specifically an `IntStream`.

---

# 🔍 Why `max()`?

We need the largest element from the stream.

Therefore, we use:

```java
.max()
```

Example:

```text
Stream: 1 → 2 → 3 → 4
                    ↓
                  max()
                    ↓
                    4
```

The important point is that `max()` returns:

```java
OptionalInt
```

instead of directly returning `int`.

---

# 🔍 Why `getAsInt()`?

`max()` returns an `OptionalInt` because a stream could potentially be empty.

For example:

```java
int[] arr = {};
```

There would be no maximum value.

Therefore, Java uses `OptionalInt` to represent:

```text
A value may exist
       OR
No value may exist
```

In this problem, the constraints guarantee that the array has at least one element:

```text
arr.length ≥ 1
```

So we can safely use:

```java
.getAsInt()
```

to get the actual integer.

---

# ⚡ One-Line Solution

```java
int max = Arrays.stream(arr).max().getAsInt();
```

---

# 🔄 Traditional Approach vs Stream

### Traditional Approach

```java
int max = arr[0];

for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

### Stream Approach

```java
int max = Arrays.stream(arr).max().getAsInt();
```

The Stream approach expresses the operation directly:

> Convert the array into a stream → find the maximum → get the integer value.

---

# ⏱️ Complexity

### Time Complexity

```text
O(n)
```

Every element may need to be checked to find the maximum.

### Space Complexity

```text
O(1)
```

Apart from the stream-related internal processing, no additional data structure proportional to `n` is required.

---

# 🧠 Key Takeaways

* `Arrays.stream(arr)` converts an `int[]` into an `IntStream`.
* `max()` finds the largest element.
* `max()` returns an `OptionalInt`.
* `getAsInt()` extracts the actual `int` value.
* Since the array is guaranteed to be non-empty, `getAsInt()` is safe here.
* Finding the maximum takes **O(n)** time.

### ⭐ Remember

```java
Arrays.stream(arr).max().getAsInt();
```

Think:

```text
Array
 ↓
Stream
 ↓
Maximum
 ↓
OptionalInt
 ↓
Actual int
```
