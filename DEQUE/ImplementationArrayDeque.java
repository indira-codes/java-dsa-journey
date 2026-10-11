package DEQUE;

import java.util.ArrayDeque;

public class ImplementationArrayDeque {
    public static void main(String[] args) {
        
        // creating empty ArrayDeque
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        // Adding items to the ad using add()
        ad.add(10);
        ad.add(20);
        ad.add(30);

        System.out.println(ad);
    }
}
