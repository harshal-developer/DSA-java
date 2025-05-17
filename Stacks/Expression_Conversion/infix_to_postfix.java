package Stacks.Expression_Conversion;
import java.util.Stack;
public class infix_to_postfix {

    public static int precedence(char ch){
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
    public static String convert(String expression){
        StringBuilder result = new StringBuilder(); //maintain operands + operators
        Stack<Character> stack = new Stack<>(); //maintain operaters

//        convert to char array to scan each character
        for(char ch : expression.toCharArray()){
//            1.ch can character or digit so
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }
//            ch can be an opening bracket
            else if (ch == '('){
                stack.push(ch);
            }
//            ch can be a clsoing bracket
            else if(ch == ')'){
//                then append the popped element into result untill recently added opening backet no found
                while (!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                stack.pop();//deletes final opening bracket
            }
//            ch can be operaters like +, - , *, /, ^;
            else{
//                then
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
//        if any operator reminning in stack then at it to the end
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static void main(String[] args){
        String expression = convert("(D-C)*(B+A)");
        System.out.println(expression);
    }
}
