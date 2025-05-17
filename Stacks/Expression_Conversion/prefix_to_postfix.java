package Stacks.Expression_Conversion;

import java.util.Stack;

public class prefix_to_postfix {

    public static boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
    public static String convert(String prefix){
//        take empty stack to store operands
        Stack<String> stack = new Stack<>();
//        Operatiosn on reversed string
        for(int i = prefix.length() - 1; i >= 0; i--){
            char ch = prefix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch + "");
            }else if(isOperator(ch)){
//                check whether it is operator or not
//                pop two times
                String first = stack.pop();
                String second = stack.pop();
                String newExpression = first + "" + second + "" + ch;
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
