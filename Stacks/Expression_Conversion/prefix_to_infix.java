package Stacks.Expression_Conversion;

import java.util.Stack;

public class prefix_to_infix {
    static boolean isOperater(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    static String convert(String prefix){
//        reverse action
        Stack<String> stack = new Stack<>();
        for(int i = prefix.length() - 1; i >= 0; i--){
            char ch = prefix.charAt(i);
//            if operand
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch + "");
            }else if(isOperater(ch)){
                String first = stack.pop();
                String second = stack.pop();
                String newExpression = "(" + first + "" + ch + "" + second + ")";
                stack.push(newExpression);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args){
        String prefix = "*+AB-CD";
        System.out.println(convert(prefix));
    }
}
