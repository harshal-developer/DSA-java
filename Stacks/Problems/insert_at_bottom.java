package Stacks.Problems;

import java.util.Scanner;
import java.util.Stack;

public class insert_at_bottom{
    static void insertAtBottom(Stack<Integer> st, int x){
        if(st.size() == 0){
            st.push(x);
            return;
        }

        int popped = st.pop();
        insertAtBottom(st, x);
        st.push(popped);  
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int size = 5;
        System.out.println("Enter 5 elements in stack : ");
        for(int i = 0; i < size; i++){
            stack.push(sc.nextInt());
        }

        System.out.println("Enter the no you want to add at bottom : ");
        int no = sc.nextInt();
        insertAtBottom(stack, no);
        while (!stack.isEmpty()) {    
            int p = stack.pop();
            System.out.print(p + " ");
        }   
    }
}