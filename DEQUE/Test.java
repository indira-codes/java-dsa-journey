package DEQUE;

import java.util.*;



// Java program to demonstrate the working 
// of a Deque in java

public class Test {
    public static void main(String[] args) {
        
        Deque<Integer> d = new LinkedList<>();

        // Add elements to front of queue
        d.offerFirst(10);

        // Add elements to end of queue
        d.offerLast(20);

        // Adds element to front of queue
        d.offerLast(5);

        d.offerFirst(15);

        // Retrieve the head element
        System.out.println(d.peekFirst());

        // Retrieve the tail element
        System.out.println(d.peekLast());

        // Retrieve and remove the tail element
        d.pollLast();

        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

    }
}
