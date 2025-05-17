package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class bracket_problem {
    public static void main(String[] args){
        System.out.println("Enter any bracket combinations : ");
        Scanner sc = new Scanner(System.in);
        String brackets = sc.nextLine();
        checkBracketPattern(brackets);
    }
    static void checkBracketPattern(String brackets){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < brackets.length(); i++){
           char ch = brackets.charAt(i);
           if(ch == '(' || ch == '{' || ch == '['){
               stack.push(ch);
           }else if(ch == ')' || ch == '}' || ch == ']'){
               if(stack.isEmpty()){
                   System.out.println("false");
                   return;
               }
               char top = stack.pop();
               if((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')){
                   System.out.println("false");
                   return;
               }
           }
        }

        if(stack.isEmpty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
