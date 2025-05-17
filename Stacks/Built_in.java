package Stacks;

import java.util.Arrays;
import java.util.Stack;

public class Built_in {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(45);
        stack.push(30);
        stack.push(20);

//        System.out.println(stack.push(100));
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
        int a = 3;
        System.out.println(a++); //3
        System.out.println(a); //4
        System.out.println(stack.isEmpty());

    }
}
