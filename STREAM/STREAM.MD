# Java Streams

## 📌 What is a Stream in Java?

A **Stream** in Java is a way to process a collection or sequence of data in a simple and declarative way.

Streams were introduced in **Java 8**.

A Stream does not store data. Instead, it takes data from a source such as an array or collection and performs operations on that data.

### Simple Flow

```text
Data Source
    ↓
   Stream
    ↓
Intermediate Operations
    ↓
Terminal Operation
    ↓
   Result
```

For example:

```java
Arrays.stream(arr)
      .filter(x -> x > 5)
      .sum();
```

Here:

* `Arrays.stream(arr)` → creates a stream from the array
* `filter()` → selects elements
* `sum()` → calculates the final result

---

# 🔹 Why Use Streams?

Without streams, we commonly use loops:

```java
int sum = 0;

for (int num : arr) {
    sum += num;
}
```

Using Stream:

```java
int sum = Arrays.stream(arr).sum();
```

Streams make data-processing code more **concise, readable, and declarative**.

---

# 🔹 How to Create a Stream?

## From an Array

For an `int[]`:

```java
int[] arr = {1, 2, 3, 4};

Arrays.stream(arr);
```

For an object array:

```java
String[] names = {"Alice", "Bob", "John"};

Arrays.stream(names);
```

## From a Collection

```java
List<Integer> numbers = List.of(1, 2, 3, 4);

numbers.stream();
```

---

# 🔹 Types of Stream Operations

Stream operations are mainly divided into two types:

## 1. Intermediate Operations

Intermediate operations transform or filter the stream.

Examples:

```text
filter()
map()
sorted()
distinct()
limit()
skip()
```

They return another Stream.

Example:

```java
Arrays.stream(arr)
      .filter(x -> x > 2);
```

---

## 2. Terminal Operations

Terminal operations produce the final result.

Examples:

```text
sum()
min()
max()
count()
forEach()
collect()
reduce()
```

Example:

```java
Arrays.stream(arr).sum();
```

Once a terminal operation is executed, the stream is consumed.

---

# 🔹 Common Stream Methods

### `filter()`

Used to select elements based on a condition.

```java
Arrays.stream(arr)
      .filter(x -> x > 5);
```

---

### `map()`

Used to transform each element.

```java
Arrays.stream(arr)
      .map(x -> x * 2);
```

Example:

```text
Input:  1 2 3
Output: 2 4 6
```

---

### `sorted()`

Sorts the elements.

```java
Arrays.stream(arr)
      .sorted();
```

---

### `distinct()`

Removes duplicate elements.

```java
Arrays.stream(arr)
      .distinct();
```

---

### `count()`

Counts the number of elements.

```java
long count = Arrays.stream(arr).count();
```

---

### `sum()`

Calculates the sum of elements.

```java
int sum = Arrays.stream(arr).sum();
```

---

### `min()`

Finds the minimum value.

```java
int min = Arrays.stream(arr)
               .min()
               .getAsInt();
```

---

### `max()`

Finds the maximum value.

```java
int max = Arrays.stream(arr)
               .max()
               .getAsInt();
```

---

### `forEach()`

Performs an action for every element.

```java
Arrays.stream(arr)
      .forEach(x -> System.out.println(x));
```

---

# 🧠 Important: Stream Does Not Modify the Original Data

A Stream processes data but does not normally change the original array or collection.

Example:

```java
int[] arr = {1, 2, 3, 4};

Arrays.stream(arr)
      .map(x -> x * 2)
      .forEach(System.out::println);
```

Output:

```text
2
4
6
8
```

The original array is still:

```text
1 2 3 4
```

---

# 🚀 Problem: Find Sum of Array Using Streams

## Problem Statement

Given an integer array `arr[]`, find the sum of all elements using Java Streams.

### Example 1

```text
Input:  1 2 3 4
Output: 10
```

Explanation:

```text
1 + 2 + 3 + 4 = 10
```

### Example 2

```text
Input:  3 2 1
Output: 6
```

Explanation:

```text
3 + 2 + 1 = 6
```

---

# 💡 Approach

We can use:

```java
Arrays.stream(arr)
```

to convert the integer array into an `IntStream`.

Then we use:

```java
.sum()
```

to calculate the sum of all elements.

### Flow

```text
int[] arr
   ↓
Arrays.stream(arr)
   ↓
IntStream
   ↓
sum()
   ↓
Answer
```

---

# 💻 Java Code

```java
import java.util.Arrays;

public class ArraySumUsingStream {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int sum = Arrays.stream(arr).sum();

        System.out.println("Sum of array: " + sum);
    }
}
```

### Output

```text
Sum of array: 10
```

---

# 🔍 Code Explanation

### 1. Import Arrays

```java
import java.util.Arrays;
```

`Arrays` is a utility class from Java's `java.util` package.

It provides useful methods for working with arrays.

One of those methods is:

```java
Arrays.stream()
```

---

### 2. Create the Array

```java
int[] arr = {1, 2, 3, 4};
```

Our input array is:

```text
1 2 3 4
```

---

### 3. Convert Array into Stream

```java
Arrays.stream(arr)
```

This converts the `int[]` array into an `IntStream`.

```text
Array
{1, 2, 3, 4}
       ↓
Arrays.stream(arr)
       ↓
IntStream
1 → 2 → 3 → 4
```

---

### 4. Calculate the Sum

```java
Arrays.stream(arr).sum();
```

The `sum()` method adds all the elements:

```text
1 + 2 + 3 + 4
       ↓
      10
```

---

# ⚡ Loop vs Stream

### Traditional Approach

```java
int sum = 0;

for (int num : arr) {
    sum += num;
}
```

### Stream Approach

```java
int sum = Arrays.stream(arr).sum();
```

The Stream approach is shorter and expresses the operation directly:

> "Take this array and calculate its sum."

---

# 🧠 Key Takeaways

* Streams were introduced in **Java 8**.
* A Stream is used to process data.
* A Stream does not store data.
* `Arrays.stream(arr)` converts an array into a Stream.
* For `int[]`, it creates an `IntStream`.
* Intermediate operations include `filter()`, `map()`, `sorted()`, etc.
* Terminal operations include `sum()`, `count()`, `max()`, `min()`, `forEach()`, etc.
* A Stream can be processed only once.
* Streams help write concise and readable data-processing code.

## ⭐ Most Important Pattern

```java
Arrays.stream(arr)
      .operation();
```

For sum:

```java
Arrays.stream(arr).sum();
```

For maximum:

```java
Arrays.stream(arr).max().getAsInt();
```

For minimum:

```java
Arrays.stream(arr).min().getAsInt();
```

For count:

```java
Arrays.stream(arr).count();
```
