package STREAM;

/* 
🚀 Problem: Find Sum of Array Using Streams
Problem Statement

Given an integer array arr[], find the sum of all elements using Java Streams.

Example 1
Input:  1 2 3 4
Output: 10

Explanation:

1 + 2 + 3 + 4 = 10

Approach

We can use:

Arrays.stream(arr)

to convert the integer array into an IntStream.

Then we use:

.sum()

to calculate the sum of all elements.

Flow
int[] arr
   ↓
Arrays.stream(arr)
   ↓
IntStream
   ↓
sum()
   ↓

   
 */

import java.util.Arrays;

public class ArraySumUsingStream {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int sum = Arrays.stream(arr).sum();

        System.out.println("Sum of array: " + sum);
    }
}