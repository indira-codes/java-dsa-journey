package DEQUE;

import java.util.ArrayDeque;


// Java program to demonstrate working of
// ArrayDeque in java

public class ArrayDequeAsQueue {
    public static void main(String[] args) {
        // creating empty ArrayDeque as Queue
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();

        // Add items to the ad using offer() at last
        ad.offer(10);
        ad.offer(20);

        // Returns the front of Queue , 10
        System.out.println(ad.peek());

             // Returns and Removes the front of queue, 10
        System.out.println(ad.poll());

        // Returns the front of Queue, 20
        System.out.println(ad.peek());

        // Adds 40 to last Queue
        ad.offer(40);

        // Returns the front of Queue, 20
        System.out.println(ad.peek());
    }
}
