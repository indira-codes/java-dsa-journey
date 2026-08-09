package STREAM;

import java.util.Arrays;

/* 
Find Average of Array Using Streams
Problem Statement

Given an integer array arr[], return the average of all elements in the array using Java Streams.

Formula
Average = Sum of all elements / Number of elements
Examples
Example 1
Input:  arr[] = [1, 2, 3, 4]
Output: 2.5

Explanation:

Sum = 1 + 2 + 3 + 4 = 10
number of elements = 4
average = 10/4 = 2.5

======================================
Approach

We can use Java's Stream API to calculate the average directly.

Step 1: Convert Array into Stream

The input is an int[] array.

A normal Java array does not have a .stream() method, so we use:

Arrays.stream(arr)

This converts the int[] into an IntStream.

int[] arr
    ↓
Arrays.stream(arr)
    ↓
IntStream
*/

public class ArrayAverageUsingStream {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        double average = Arrays.stream(arr)
                            .average()
                            .getAsDouble();

        System.out.println("Average of array: " + average);
    }
}