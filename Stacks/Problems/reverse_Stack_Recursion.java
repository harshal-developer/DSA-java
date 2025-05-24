package Stacks.Problems;

import java.util.Stack;

public class reverse_Stack_Recursion {
    // Function to insert element at bottom of stack
    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();                 // pop top element
        insertAtBottom(stack, value);          // recursive call
        stack.push(top);                       // push back the popped item
    }

    // Function to reverse the stack
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();                 // pop top element
        reverseStack(stack);                   // reverse the rest
        insertAtBottom(stack, top);            // insert current element at bottom
    }

    // Main method to test the logic
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing some elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);  // Reversing the stack

        System.out.println("Reversed Stack: " + stack);
    }
}
