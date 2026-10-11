package DEQUE;

import java.util.ArrayDeque;

// Java program to demonstrate working of
// ArrayDeque in Java

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        
        // creating empty ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Pushing items to the ad 
        ad.push(10);
        ad.push(20);

        // returns the top of stack, 20
        System.out.println(ad.peek());

        // Returns  and removes the top of stack, 20
        System.out.println(ad.pop());

        // returns the top of stack, 10
        System.out.println(ad.peek());

        // Pushes 40
        ad.push(40);

        // Returns the top of stack, 40
        System.out.println(ad.peek());
    }
}
