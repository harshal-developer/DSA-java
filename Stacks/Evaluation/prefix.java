package Stacks.Evaluation;

import java.util.Stack;

public class prefix {
    static int evaluatePrefix(String prefix){
        Stack<Integer> stack = new Stack<>();
        // reverse action 
        for(int i = prefix.length() - 1; i >= 0; i--){
            char ch = prefix.charAt(i);
            if(Character.isDigit(ch)){
                stack.push(ch - '0');
            }else{
                int a = stack.pop();
                int b = stack.pop();
                if(ch == '+')
                    stack.push(a + b);
                else if(ch == '-')
                    stack.push(a - b);
                else if(ch == '*')
                    stack.push(a * b);
                else if(ch == '/')
                    stack.push(a / b);
                else if(ch == '^')
                    stack.push((int)Math.pow(a, b));
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println(evaluatePrefix("-+*23*549"));
    }
}