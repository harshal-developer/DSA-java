package Stacks.Evaluation;

import java.util.Stack;

public class postfix{
    static int evaluatePostfix(String postfix){
        Stack<Integer> stack = new Stack<>();   
        for(char ch : postfix.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch - '0');
            }else{
                int b = stack.pop();
                int a = stack.pop();

                switch(ch){
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                    case '^': stack.push((int)Math.pow(a, b)); break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        System.out.println(evaluatePostfix("53+62/*"));
    }
}