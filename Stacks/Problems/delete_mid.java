package Stacks.Problems;

import java.util.Stack;

public class delete_mid{
    static void deleteMid(Stack<Integer> st){
        delete(st, 0, st.size());
    }
    static void delete(Stack<Integer> st, int current, int size){
        if(current == size / 2){
            st.pop();
            return;
        }
        int x = st.pop();
        current += 1;
        delete(st, current, size);
        st.push(x);
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        deleteMid(stack);

        while (!stack.isEmpty()) {
            int i = stack.pop();
            System.out.print(i + " ");
        }
    }
}