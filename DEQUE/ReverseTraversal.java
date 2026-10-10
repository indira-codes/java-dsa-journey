package DEQUE;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

// java program to demonstrate the working
// of Reversal Traversal of Deque in java

public class ReverseTraversal {
    public static void main(String[] args) {
        
        Deque<Integer> d = new LinkedList<>();

        // Adds element to front of queue
        d.addFirst(10);

             // Adds element to end of queue
        d.addLast(20);
        
        // Adds element to front of queue
        d.addFirst(5);
        
        // Adds element to end of queue
        d.addLast(15);

        // Traversal using Iterator
        Iterator it = d.descendingIterator();
        
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
    
}
