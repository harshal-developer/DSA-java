package Stacks.Expression_Conversion;

import java.util.Stack;

public class postfix_to_prefix {

    static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    static String convert(String postfix){
        Stack<String> stack = new Stack<>();
        // convert to prefix
        for(int i = 0; i < postfix.length(); i++){
            char ch = postfix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch + "");
            }else if(isOperator(ch)){
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String newExpression = ch + "" + operand2 + "" + operand1 + "";
                stack.push(newExpression);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args){
        System.out.println(convert("ABC/-AK/L-*"));
    }
}
