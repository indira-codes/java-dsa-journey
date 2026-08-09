# 📌 Find Average of Array Using Streams

## Problem Statement

Given an integer array `arr[]`, return the **average** of all elements in the array using Java Streams.

### Formula

```text
Average = Sum of all elements / Number of elements
```

---

## Examples

### Example 1

```text
Input:  arr[] = [1, 2, 3, 4]
Output: 2.5
```

**Explanation:**

```text
Sum = 1 + 2 + 3 + 4
    = 10

Number of elements = 4

Average = 10 / 4
        = 2.5
```

### Example 2

```text
Input:  arr[] = [3, 2, 1]
Output: 2.0
```

**Explanation:**

```text
Sum = 3 + 2 + 1
    = 6

Number of elements = 3

Average = 6 / 3
        = 2.0
```

---

## Constraints

```text
1 ≤ arr.length ≤ 10⁵
1 ≤ arr[i] ≤ 10⁵
```

---

# 💡 Approach

We can use Java's **Stream API** to calculate the average directly.

### Step 1: Convert Array into Stream

The input is an `int[]` array.

A normal Java array does not have a `.stream()` method, so we use:

```java
Arrays.stream(arr)
```

This converts the `int[]` into an `IntStream`.

```text
int[] arr
    ↓
Arrays.stream(arr)
    ↓
IntStream
```

---

### Step 2: Calculate Average

`IntStream` provides an `average()` method.

```java
Arrays.stream(arr).average()
```

It calculates:

```text
Sum of elements
----------------
Number of elements
```

For:

```text
[1, 2, 3, 4]
```

the calculation is:

```text
10 / 4 = 2.5
```

---

### Step 3: Why Does `average()` Return `OptionalDouble`?

The `average()` method does not directly return a `double`.

It returns:

```java
OptionalDouble
```

Why?

Because a Stream can be empty.

For example:

```java
int[] arr = {};
```

There is no meaningful average for an empty array.

So Java uses `OptionalDouble` to represent:

```text
A double value may exist
        OR
No value may exist
```

In this problem, the constraints guarantee:

```text
arr.length ≥ 1
```

So the array cannot be empty.

---

### Step 4: Get the Actual Value

Since `average()` returns an `OptionalDouble`, we use:

```java
.getAsDouble()
```

to extract the actual `double` value.

Therefore:

```java
Arrays.stream(arr)
      .average()
      .getAsDouble();
```

---

# 🔄 Complete Flow

```text
        int[] arr
            ↓
   Arrays.stream(arr)
            ↓
         IntStream
            ↓
        average()
            ↓
     OptionalDouble
            ↓
      getAsDouble()
            ↓
          double
```

For example:

```text
[1, 2, 3, 4]
      ↓
IntStream
      ↓
average()
      ↓
OptionalDouble[2.5]
      ↓
getAsDouble()
      ↓
2.5
```

---

# 💻 Java Code

```java
import java.util.Arrays;

public class ArrayAverageUsingStream {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        double average = Arrays.stream(arr)
                               .average()
                               .getAsDouble();

        System.out.println("Average of array: " + average);
    }
}
```

### Output

```text
Average of array: 2.5
```

---

# 🔍 Why `Arrays.stream(arr)`?

`arr` is an `int[]`.

We cannot write:

```java
arr.stream(); // ❌ Error
```

because Java arrays do not have a `stream()` method.

Therefore, we use the `Arrays` utility class:

```java
Arrays.stream(arr);
```

For an `int[]`, this creates an:

```text
IntStream
```

---

# 🔍 Why `average()`?

We need the average of all elements.

`IntStream` provides:

```java
.average()
```

which calculates the arithmetic mean of the stream elements.

For:

```text
1, 2, 3, 4
```

it conceptually calculates:

```text
Sum = 10
Count = 4

Average = 10 / 4
        = 2.5
```

---

# 🔍 Why `getAsDouble()`?

The result of:

```java
.average()
```

is:

```java
OptionalDouble
```

not:

```java
double
```

So:

```java
.getAsDouble()
```

extracts the actual `double` value.

```text
OptionalDouble[2.5]
        ↓
getAsDouble()
        ↓
2.5
```

---

# ⚡ Stream vs Traditional Approach

### Traditional Approach

```java
int sum = 0;

for (int num : arr) {
    sum += num;
}

double average = (double) sum / arr.length;
```

### Stream Approach

```java
double average = Arrays.stream(arr)
                       .average()
                       .getAsDouble();
```

The Stream approach directly expresses what we want:

> Convert the array into a stream and calculate its average.

---

# ⏱️ Complexity

### Time Complexity

```text
O(n)
```

The stream may need to process every element to calculate the sum and count.

### Space Complexity

```text
O(1)
```

No additional data structure proportional to the input size is required.

---

# 🧠 Key Takeaways

* `Arrays.stream(arr)` converts an `int[]` into an `IntStream`.
* `average()` calculates the arithmetic mean.
* `average()` returns an `OptionalDouble`.
* `getAsDouble()` extracts the actual `double` value.
* The answer can contain decimals, so we use `double`.
* The array is guaranteed to be non-empty by the constraints.
* Time Complexity: **O(n)**
* Space Complexity: **O(1)**

## ⭐ Remember

```java
double average = Arrays.stream(arr)
                       .average()
                       .getAsDouble();
```

### Memory Trick

```text
int[] 
 ↓
Arrays.stream()
 ↓
IntStream
 ↓
average()
 ↓
OptionalDouble
 ↓
getAsDouble()
 ↓
double
```
