package Stacks.Expression_Conversion;

import java.util.Stack;

public class infix_to_prefix {
//    Second step
    static String convertToPostfix(String reversed){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char ch : reversed.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }else if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                stack.pop();
            }else{
//                at the end when we want to choose operators to place it at end
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.toString();
    }

    static int precedence(char ch){
        if(ch == '^'){
            return 3;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }else if(ch == '+' || ch == '-'){
            return 1;
        }else{
            return -1;
        }
    }

//    first Step
    public static String convert(String infix){
//        1. reverse
        StringBuilder input = new StringBuilder(infix).reverse();
//        2. swap the brackets
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '('){
                input.setCharAt(i, ')');
            }else if(ch == ')'){
                input.setCharAt(i, '(');
            }
        }
//        3. convert to postfix
        String postfix = convertToPostfix(input.toString());

//        4. reverse the postfix
        StringBuilder prefix = new StringBuilder(postfix).reverse();
        return prefix.toString();
    }

    public static void main(String[] args){
        System.out.println("Prefix : " + convert("(A+B)*(C-D)"));
    }
}
