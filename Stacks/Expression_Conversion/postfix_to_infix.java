package Stacks.Expression_Conversion;

import java.util.Stack;

public class postfix_to_infix {

    public static boolean isCharacter(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }

    public static String convert(String postfix) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else if (isCharacter(ch)) {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String newExpression = "(" + operand1 + " " + ch + " " + operand2 + ")";
                stack.push(newExpression);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(convert("AB+C*DE/-"));
    }
}
