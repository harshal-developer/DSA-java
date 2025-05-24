package Stacks.Problems;

import java.util.Stack;

public class reverse_stack{
  // Function to insert element at the bottom of stack
    public static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        insertAtBottom(stack, x);
        stack.push(temp);
    }

    // Function to reverse the stack
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    // Example usage
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(10);
        st.push(30);

        System.out.println("Before reverse: " + st);
        reverse(st);
        System.out.println("After reverse:  " + st);
    }
}