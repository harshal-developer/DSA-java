package Stacks.Problems;

import java.time.format.SignStyle;
import java.util.Scanner;
import java.util.Stack;

public class next_greatest_element {

    static void printNextGreaterElement(int[] arr){
        int size = arr.length;
        int[] result = new int[size];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < size; i++){
            while (!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for (int j : result) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array numbers : ");
        int[] arr = new int[6];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        printNextGreaterElement(arr);
    }
}
