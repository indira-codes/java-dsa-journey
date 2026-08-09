package STREAM;

import java.util.Arrays;

/*
Problem: Find Maximum Element Using Streams
📌 Problem Statement

Given an integer array arr[], return the maximum element from the array using Java Streams.

Example 1
Input:  arr[] = [1, 2, 3, 4]
Output: 4

Explanation:
From the given array, 4 is the maximum element.

===========================================================
Approach

We can find the maximum element using the Java Stream API.

Step 1: Convert Array into Stream

We use:

Arrays.stream(arr)

Because arr is an int[], this creates an IntStream.

int[] arr
    ↓
Arrays.stream(arr)
    ↓
IntStream
Step 2: Find the Maximum Element

After creating the stream, we use:

.max()

The max() method checks the elements in the stream and finds the largest value.

1 → 2 → 3 → 4
          ↓
        max()
          ↓
          4

However, max() returns an OptionalInt, not a direct int.

Step 3: Get the Actual Integer

We use:

.getAsInt()

to extract the actual int value from the OptionalInt.

So the complete expression becomes:

Arrays.stream(arr)
      .max()
      .getAsInt();
Complete Flow
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

Since the constraints guarantee:

arr.length ≥ 1

the array cannot be empty, so getAsInt() is safe for this problem.

 */

public class ArrayMaxUsingStream {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int max = Arrays.stream(arr)
                        .max()
                        .getAsInt();

        System.out.println("Maximum element: " + max);
    }
}
