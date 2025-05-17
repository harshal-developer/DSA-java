package Exerciess;

import java.util.Scanner;

public class str_length {
    public static void main(String[] args){
        System.out.print("Enter a string you want : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int counter = 0;

        for(int i = 0; i <= str.length() - 1; i++){
            counter++;
        }
        System.out.print(counter);
   }
}
