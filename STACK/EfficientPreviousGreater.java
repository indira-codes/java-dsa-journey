package STACK;

import java.util.ArrayDeque;
import java.util.Deque;


public class EfficientPreviousGreater {
    
    static void printGreater(int[] arr){

        // Create a stack
        Deque<Integer> stack = new ArrayDeque<>();

        // First element has no previous element
        stack.push(arr[0]);
        System.out.print(-1 + " ");

        // Process remaining elements
        for(int i = 1; i < arr.length; i++){

            // Remove elements that cannot be 
            // previous greater elements 
            while(stack.isEmpty() == false && stack.peek() <= arr[i]){

                stack.pop();
            }

            // if stack is empty, no previous 
            // greater element exists
            int pg = stack.isEmpty() ? -1 : stack.peek();

            System.out.print(pg + " ");

            // current element can be useful
            // for future elements

            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {20,30,10,5,15};

        printGreater(arr);
    }
}
