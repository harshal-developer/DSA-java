package Stacks.Problems;

import java.util.Scanner;
import java.util.Stack;

class reverse_words_in_string{
    static String reverseWordsInString(String str){
        StringBuilder string = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                stack.push(str.charAt(i));
            }else{
                while (!stack.isEmpty()) {
                    string.append(stack.pop());
                }
                string.append(" ");
            }
        }

        while (!stack.isEmpty()) {
            string.append(stack.pop());
        }
        return string.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String str = sc.nextLine();
        System.out.println(reverseWordsInString(str));
    }
}