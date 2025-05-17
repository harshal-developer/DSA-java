package Exerciess;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args){
//        harshal
        System.out.println("Enter any string you want to reverse : ");
        Scanner sc = new Scanner(System.in);
        String input_string = sc.nextLine();

        String reversed = "";
        for(int i = input_string.length() - 1; i >= 0 ; i--){
            reversed+=input_string.charAt(i);
        }
        System.out.println(reversed);
    }

}
