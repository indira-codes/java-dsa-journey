package STACK;

import java.util.ArrayDeque;

public class Demo_2 {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<Integer>();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
