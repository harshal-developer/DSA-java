package Stacks.Problems;

import java.util.Stack;

public class LC_155_MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    LC_155_MinStack(){
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value){
        mainStack.push(value);

        if(minStack.isEmpty() || value <= minStack.peek()){
            minStack.push(value);
        }
    }

    public void pop(){
        int popped = mainStack.pop();

        while (popped == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top(){
        return mainStack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        LC_155_MinStack stack = new LC_155_MinStack();
        stack.push(2);
        stack.push(12);
        stack.push(45);
        stack.push(1);
        stack.push(10);
        System.out.println(stack.getMin());
    }
}
