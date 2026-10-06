package STACK;

import java.util.ArrayDeque;
import java.util.Deque;


public class Demo_4 {

    // Checks Whether the opening and closing brackets match
    public static boolean isMatching(char open, char close){

        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    // Checks whether the given string has balanced brackets
    public static boolean isBalanced(String str){

        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < str.length(); i++){
            char x = str.charAt(i);

            // if opening bracket -> push into stack
            if(x == '(' || x == '{' || x == '['){

                stack.push(x);

            }
            // if closing bracket
            else {

                // No opening bracket available
                if(stack.isEmpty()){
                    return false;
                }

                // Opening and closing brackets don't match
                if(isMatching(stack.peek(), x) == false){
                    return  false;
                }

                // Matching pair found -> remove opening bracket
                stack.pop();
            }
        }

        // Stack must be empty after string
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        
        String str = "{[()]}";

        System.out.println(isBalanced(str));
    }
    
}
