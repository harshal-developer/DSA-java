package Stacks.Problems;

import java.util.Scanner;
import java.util.Stack;

public class String_reverse_using_stack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str = sc.nextLine();

        String reversed = reverseString(str);
        System.out.println(reversed);
    }

    private static String reverseString(String str){
       Stack<Character> stack = new Stack<>();

       for(int i = 0 ; i < str.length(); i++){
           stack.push(str.charAt(i));
       }

       StringBuilder reversed = new StringBuilder();

       while (!stack.isEmpty()){
           reversed.append(stack.pop());
       }

       return reversed.toString();
    }

}
