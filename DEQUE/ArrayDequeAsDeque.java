package DEQUE;

import java.util.ArrayDeque;

// java program to demonstrate working of ArrayDeque in java

public class ArrayDequeAsDeque {
    public static void main(String [] args){
        // creating empty ArrayDeque as Deque
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Add items 
        ad.offerFirst(10);
        ad.offerFirst(20);
        ad.offerFirst(30);
        ad.offerLast(40);

             // Returns 30
        System.out.println(ad.peekFirst());
        
        // Returns 40
        System.out.println(ad.peekLast());
        
        // Returns and removes 30
        System.out.println(ad.pollFirst());
        
        // Returns 10
        System.out.println(ad.peekFirst());
        
        // Returns and removes 40
        System.out.println(ad.pollLast());
        
        // Returns 20
        System.out.println(ad.peekLast());
    }
    
}
